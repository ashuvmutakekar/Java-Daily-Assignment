package Acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		List <Account> AccList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		  int ch=0;
		do {
			System.out.println("1 .Add Account");
			System.out.println("2 .Display All Account");
			System.out.println("3 .Sort by Account no desc");
			System.out.println("4 .Sort by Account Name");
			System.out.println("5 .Sort by Account date Of Opening");
            System.out.println("6 .Sort by Balance in Descending");
          
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
                System.out.println("Enter Amount :");
                double a=sc.nextDouble();
                Double amount=ValidateFields.validateBalance(a);
                if(dop ==null||amount == 0.0)
                {
                	System.out.println("Your date and balance are invalid");
                }
                else {
                	AccList.add(new Account(name,dop,amount));
                  System.out.println("Account Added Successfully");
                   }
            }
            for(Account acc : AccList) {
				System.out.println(acc);
				}
               
               break;
            case 2:{
            	for(Account acc : AccList) {
					System.out.println(acc);
					}
                   }
                           break;
                           
            case 3:{
            	System.out.println("Sort by Account no desc");
            	Collections.sort(AccList, new CompareAccno());
            } break;
                
            case 4:{
            	System.out.println("Sort by Account name");
            	Collections.sort(AccList,new CampareName());
                 }
            break;
            case 5:{
            	System.out.println("5 .Sort by Account date Of Opening");
            	Collections.sort(AccList,new compareDOP());
            } break;
            case 6:{
            
                System.out.println("Sort by Balance in Descending");
                Collections.sort(AccList,new compareBalance());
            } break;
           
            }
		} while(ch<7);
		
	}

}
