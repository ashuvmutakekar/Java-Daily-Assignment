package Acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Dac.AccountNotFoundException;

public class AccountTest {

	public static void main(String[] args) {
		List <Account> AccList=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		  int ch=0;
		do {
			System.out.println("1 .Add Account");
			System.out.println("2 .Display All Account");
			System.out.println("3 .Display Details according to acc no");
			System.out.println("4 .Accept From A/C NO  and To Accoun ID and to Funds transfer.");
			System.out.println("5 .Accept A/C NO & remove A/C from List");
            System.out.println("6 .Sort by Account no in Descending");
            System.out.println("7 .Sort by Account opening date");
            System.out.println("Enter your choice : ");
            ch=sc.nextInt();
            sc.nextLine();
            switch(ch) {
            case 1:{
     
            	System.out.println("Enter name :");
                String name=sc.nextLine();
                System.out.println("Enter Date of Opening :");
                 String d=sc.nextLine();
                LocalDate dop=ValidateFields.validateDop(d);
                System.out.println("Enter type of account SA/CA/DA");
                String t=sc.nextLine();
                Acc_Type type=ValidateFields.ValidateAccType(t);
                System.out.println("Enter Amount :");
                double a=sc.nextDouble();
                Double amount=ValidateFields.validateBalance(a);
                if(type.equals(Acc_Type.valueOf("SA"))) 
                {
                	System.out.println("Enter apply enterest");
                	int h=sc.nextInt();
                	amount=amount+(h*amount)/100;
                }
                if(dop ==null||amount == 0.0)
                {
                	System.out.println("Your date and balance are invalid");
                }
                else {
                	 AccList.add(new Account(name,dop,type,amount));
                     System.out.println("Account Added Successfully");
                   }
                 }
                  
               
                 break;
            case 2:{
            	for(Account acc : AccList) {
					System.out.println(acc);
					}
                   }break;
                           
            case 3:{
            	    System.out.println("Display Details according to acc no");
            	    System.out.println("Enter acc no :");
            	    Integer no1 = sc.nextInt();
            	    boolean accountFound = false; 

            	    try {
            	        for (Account a : AccList) {
            	            if (a.getAccno().equals(no1)) {
            	                System.out.println(a);
            	                accountFound = true; 
            	                break; 
            	            }
            	        }
            	        
            	        if (!accountFound) {
            	            throw new AccountNotFoundException("Account is not found");
            	        }
            	    } catch (AccountNotFoundException e) {
            	        System.out.println(e.getMessage());
            	    }

                   } break;
                
            case 4:{
            	System.out.println("Accept From A/C NO and To Account ID for funds transfer.");
            	System.out.println("Enter account no to transfer to:");
            	Integer to = sc.nextInt();
            	System.out.println("Enter account no to transfer from:");
            	Integer from = sc.nextInt();
            	System.out.println("Enter amount you want to transfer:");
            	Double amount = sc.nextDouble();

            	boolean accountFoundFrom = false;
            	boolean accountFoundTo = false;

            	try {
            	    
            	    for (Account a : AccList) {
            	        if (a.getAccno().equals(from)) {
            	            accountFoundFrom = true;
            	        }
            	        if (a.getAccno().equals(to)) {
            	            accountFoundTo = true;
            	        }
            	    }

            	   
            	    if (!accountFoundFrom) {
            	        throw new AccountNotFoundException("Source account not found");
            	    }
            	    if (!accountFoundTo) {
            	        throw new AccountNotFoundException("Destination account not found");
            	    }

            	    // Now that both accounts are found, perform withdrawal and deposit
            	    for (Account a : AccList) {
            	        if (a.getAccno().equals(from)) {
            	            a.Withdraw(amount);
            	        }
            	        if (a.getAccno().equals(to)) {
            	            a.Deposit(amount);
            	        }
            	    }
            	    
            	    System.out.println("Transfer successful!");

            	} catch (AccountNotFoundException e) {
            	    System.out.println(e.getMessage());
            	    

                   }
            }
                    break;
            case 5:{
        	    System.out.println("Remove Details according to acc no");
        	    System.out.println("Enter acc no :");
        	    Integer no1 = sc.nextInt();
        	    boolean accountFound = false; 

        	    try {
        	        for (int i=0;i<AccList.size();i++) {
        	            if (AccList.get(i).getAccno().equals(no1)) {
        	                 AccList.remove(i);
        	                accountFound = true; 
        	                break; 
        	            }
        	        }
        	        
        	        if (!accountFound) {
        	            throw new AccountNotFoundException("Account is not found");
        	        }
        	    } catch (AccountNotFoundException e) {
        	        System.out.println(e.getMessage());
        	    }

               } break;
            case 7:{
                
                System.out.println("Sort by Account opening date");
                 Collections.sort(AccList,new CompareAccno());
                 for(Account acc : AccList) {
 					System.out.println(acc);
 					}
              } break;
            case 8:{
            
                     System.out.println("Sort by Account opening date");
                      Collections.sort(AccList,new compareDOP());
                      for(Account acc : AccList) {
      					System.out.println(acc);
      					}
                   } break;
           
               }
		} while(ch<9);
		
	}

}
