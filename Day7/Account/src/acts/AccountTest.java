package acts;
import java.util.Scanner;
import acts.Account;
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
		
		int ch;
		 do { 
			    System.out.println("1.Create Saving Account");
				System.out.println("2.Create Current Account");
				System.out.println("3.Create Depost Account");
				System.out.println("4.Check applied Interest");
				System.out.println("5.Display Account");
				System.out.println("6.Exit");
		System.out.println("choose the choice what you want to do :");
        ch=sc.nextInt();
        sc.nextLine();
        	
        switch(ch)
        {
        case 1: {
        	System.out.println("Enter information for Saving Account :");
        	System.out.println("Enter name :");
            String name=sc.nextLine();
            System.out.println("Enter date of opening in format dd/MM/yyyy:");
            String date=sc.nextLine();
            String dop=AccountTest.dateTester(date);
            System.out.println("Enter ammount :");
            double amount=sc.nextDouble();
            a=new SavingAccount(name,dop,amount);
    
        }
        break;
        case 2: {
        	System.out.println("Enter information for Current Account :");
        	System.out.println("Enter name :");
            String name=sc.nextLine();
            System.out.println("Enter date of opening in format dd/MM/yyyy:");
            String date=sc.nextLine();
            String dop=AccountTest.dateTester(date);
            System.out.println("Enter ammount :");
            double amount=sc.nextDouble();
            a=new CurrentAccount(name,dop,amount);
    
        }
        break;
        case 3: {
        	System.out.println("Enter information for Deposit Account :");
        	System.out.println("Enter name :");
            String name=sc.nextLine();
            System.out.println("Enter date of opening in format dd/MM/yyyy:");
            String date=sc.nextLine();
            String dop=AccountTest.dateTester(date);
            System.out.println("Enter ammount :");
            double amount=sc.nextDouble();
            a=new CurrentAccount(name,dop,amount);
    
        }
        break;
        case 4:{
        	System.out.println("Check applied interest on your account Account :");	
        	
        	double interest=a.applyInterest();
        	System.out.println("applied interest on your account Account :" + interest);
        
             }
              break;
        case 5:{
        	System.out.println("Display Account  Details :");
        
             System.out.println(a);	
        	
        
             }
             break;
        
        case 6:break;
        
        
        }
        } while(ch < 6);
	}

}
