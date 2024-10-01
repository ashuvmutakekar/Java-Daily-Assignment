package Acts;
import java.util.Scanner;
import Acts.Account;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class AccountTest {
	public static String dateTester(String date)
	{
		final String format="dd/MM/yyyy";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		try
		{
			sdf.parse(date);
			return date;
		} catch(ParseException e)
		{
			
		  System.out.println("Invalid format");
		  return null;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account a=null;
		int ch=0;
		do {
			
			System.out.println("1.Saving");
			System.out.println("2.Currant");
			System.out.println("3.Deposit");
			System.out.println("choose the choice what you want to do :");
	        ch=sc.nextInt();
	        sc.nextLine();
	    	
	        switch(ch) {
	        case 1 :  int s=0;
	                  do {
	                	     System.out.println("1.Add Account");
		      				 System.out.println("2.Deposit Balance");
		      				 System.out.println("3.Withdraw Account");
		      				 System.out.println("4.Maturity");
		      		          System.out.println("choose the choice s :");
		                     s=sc.nextInt();
		                     sc.nextLine();
		                     
	                	   
                         
	                     switch(s) {
	                     
	                     case 1: { System.out.println("Enter information for Saving Account :");
	                        System.out.println("Enter name :");
	                        String name=sc.nextLine();
	                        System.out.println("Enter date of opening in format dd/MM/yyyy:");
	                        String date=sc.nextLine();
	                        String dop=AccountTest.dateTester(date);
	                        System.out.println("Enter ammount :");
	                        double amount=sc.nextDouble();
	                    		a= new SavingAccount(name,dop,amount);
	                        	
	                     }break;
	                     case 2:
	                    	 	if(a instanceof SavingAccount )	
	                    	 	{
	                    	 		
	                    	 	SavingAccount sa =(SavingAccount) a;
	                    	 	System.out.println("Enter amount  to deposit :");
	                    	 	double am=sc.nextDouble();
	                    	 	sa.Deposit(am);
	                    	 	}
                                  break;
	                     case 3 :if(a instanceof SavingAccount )	
                 	 	{
                 	 		
                 	 	SavingAccount sa =(SavingAccount) a;
                 	 	System.out.println("Enter amount  to deposit :");
                 	 	double am=sc.nextDouble();
                 	 	sa.Withdraw(am);
                 	 	}
                                   break;      
	                     case 4:break;
	                     }
	                	  
	                      }while(s<4);
	                  break;
	        
	           //********************************************************************************
	        case 2: int l=0;
            do {
       	     System.out.println("1.Add Account");
 				 System.out.println("2.Deposit Balance");
 				 System.out.println("3.Withdraw Account");
 				 System.out.println("4.Maturity");
 		          System.out.println("choose the choice s :");
                l=sc.nextInt();
                sc.nextLine();
                
       	   
            
            switch(l) {
            
            case 1: { System.out.println("Enter information for Saving Account :");
               System.out.println("Enter name :");
               String name=sc.nextLine();
               System.out.println("Enter date of opening in format dd/MM/yyyy:");
               String date=sc.nextLine();
               String dop=AccountTest.dateTester(date);
               System.out.println("Enter ammount :");
               double amount=sc.nextDouble();
           		a= new CurrentAccount(name,dop,amount);
               	
            }break;
            case 2:
           	 	if(a instanceof CurrentAccount )	
           	 	{
           	 		
           	 	CurrentAccount sa =(CurrentAccount) a;
           	 	System.out.println("Enter amount  to deposit :");
           	 	double am=sc.nextDouble();
           	 	sa.Deposit(am);
           	 	}
                     break;
            case 3 :if(a instanceof CurrentAccount )	
    	 	{
    	 		
            	CurrentAccount sa =(CurrentAccount) a;
    	 	System.out.println("Enter amount  to deposit :");
    	 	double am=sc.nextDouble();
    	 	sa.Withdraw(am);
    	 	}
                      break;      
            case 4:break;
            }
       	  
             }while(l<4);
         break;
	                  //*******************************************************
	        case 3:int m=0;
            do {
       	     System.out.println("1.Add Account");
 				 System.out.println("2.Maturity");
 		          System.out.println("choose the choice s :");
                m=sc.nextInt();
                sc.nextLine();
                
       	   
            
            switch(m) {
            
            case 1: { System.out.println("Enter information for Saving Account :");
               System.out.println("Enter name :");
               String name=sc.nextLine();
               System.out.println("Enter date of opening in format dd/MM/yyyy:");
               String date=sc.nextLine();
               String dop=AccountTest.dateTester(date);
               System.out.println("Enter ammount :");
               double amount=sc.nextDouble();
           		a= new DepositAccount(name,dop,amount);
               	
            }break;
            case 2:
           	 	if(a instanceof DepositAccount )	
           	 	{
           	 		
           	 	DepositAccount sa =(DepositAccount) a;
           	 	System.out.println("Enter amount  to deposit :");
           	 	double am=sc.nextDouble();
           	 	sa.CalMaturityAmount(am);
           	 	}
                     break;
                
           
            }
       	  
             }while(m<3);
         break;

	        }
			
			
		}while(ch<6);
		
		
	

		}}
