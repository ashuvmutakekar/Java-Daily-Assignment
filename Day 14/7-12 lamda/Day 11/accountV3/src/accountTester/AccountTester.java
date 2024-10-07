package accountTester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Exception.MinBalanceException;
import accountV3.AccountV3;

import accountV3.Validation;

public class AccountTester {
	public static void main(String[] args) {
		List<AccountV3> accList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter your Choice:");
		System.out.println("1. ADD ACCOUNT");
		System.out.println("2. pRINT ALL ACCOUNTS");
		System.out.println("3. SORT B ACCOUNT NUMBER");
		System.out.println("4. SORT BY ACCOUNT NAME");
		System.out.println("5. sORT BY DATE OF OPENING");
		System.out.println("6. SORT BY BALANCE");
		System.out.println("0. EXIT");
		String ch;
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			do {
			System.out.println("Enter Account no");
			Integer accNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name on account");
			String accName=sc.nextLine();
			System.out.println("Date of Opening in yyyy-mm-dd format");
			String dateOfOp = sc.nextLine();
			LocalDate dofo= Validation.validateDob( dateOfOp);
			System.out.println("Enter balance");
			Double bal=sc.nextDouble();
			try{
				
				if(bal<AccountV3.MIN_BAL) {
					throw new MinBalanceException("Balance is lower than Minimum Balance");
				}
				
			}catch(MinBalanceException e) {
				System.out.println(e.getMessage());
			}
	
			
		
			Double bal1=Validation.validateBalance(bal);
			AccountV3 acc=new AccountV3(accNo, accName, dofo, bal1);
			accList.add(acc);
			System.out.println("Do you want to add more?(Y or N)");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("Y"));
		}
		break;
		case 2:{
			accList.forEach(System.out::println);
		}
			break;
		case 3:{
			Collections.sort(accList,(o1,o2)->o1.getAccNo().compareTo(o2.getAccNo()));
			System.out.println(accList);
			
		}
		break;
		case 4:{
			Collections.sort(accList);
			System.out.println(accList);
		}
		break;
		case 5:{
			Collections.sort(accList,(o1,o2)->o1.getDateOfOpening().compareTo(o2.getDateOfOpening()));
			System.out.println(accList);
		}
		break;
		case 6:{
			
			Collections.sort(accList,(o1,o2)->o1.getBalance().compareTo(o2.getBalance()));
			System.out.println(accList);
		}
		break;
		case 0:
			return;
		
		default:
			System.out.println("Invalid Input");
			
		}
	}
}
}
