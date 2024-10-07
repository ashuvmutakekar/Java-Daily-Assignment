package accountTester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import accounts.Account;
import accounts.AccountNotFoundEx;

public class AccountsTester {
	public static void main(String[] args) throws AccountNotFoundEx {
		List<Account> accList=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter your Choice:");
		System.out.println("1. ADD ACCOUNT");
		System.out.println("2. PRINT ALL ACCOUNTS");
		System.out.println("3. DISPLAY ACCOUNT DETAILS BASED ON ACCOUNT NUMBER");
		System.out.println("4. FUND TRANSFER");
		System.out.println("5. REMOVE ACCOUNTS");
		System.out.println("6. CALCULATE INTEREST");
		System.out.println("7. SORT BY ACCOUNT NUMBER");
		System.out.println("8. SORT BY OPENING DATE");
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
			LocalDate dofo= Validation.validateDoO( dateOfOp);
			System.out.println("Enter Account Type");
			String at=sc.nextLine();
			AccountType at1=AccountType.valueOf(at);
			System.out.println("Enter balance");
			Double bal=sc.nextDouble();
			try{
				
				if(bal<Account.MIN_BAL) {
					throw new MinBalanceException("Balance is lower than Minimum Balance");
				}
				
			}catch(MinBalanceException e) {
				System.out.println(e.getMessage());
			}
	
			
		
			Double bal1=Validation.validateBalance(bal);
			Account acc=new Account(accNo, accName, dofo, bal1,at1);
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
			System.out.println("Enter the account number");
			Integer accNo = sc.nextInt();
			
			for(Account acc :accList) {
				
				try{if(accNo.equals(acc.getAccNo())) {
			System.out.println(acc);
			}
				else {
				throw new AccountNotFoundEx("Account Not Found");
				}
				}finally {
					System.out.println(acc);
				}
		}
			
			
		}
		break;
		case 4:{
			System.out.println("Enter Account Number From which Amount is to be transferred");
			Integer Acc1=sc.nextInt();
			System.out.println("Enter Account Number to which Amount is to be transferred");
			Integer Acc2 =sc.nextInt();
			System.out.println("Enter Amount");
			Double amount=sc.nextDouble();
			for(Account a: accList) {
				if(Acc1.equals(a.getAccNo())) {
					Double bal=a.getBalance();
					bal=bal-amount;
					
					a.setBalance(bal);
					try{
						
						if(bal<Account.MIN_BAL) {
							throw new MinBalanceException("Balance is lower than Minimum Balance");
						}
						
					}catch(MinBalanceException e) {
						System.out.println(e.getMessage());
					}
					
					
				}
				if(Acc2.equals(a.getAccNo())) {
					Double bal1=a.getBalance();
					bal1=bal1+amount;
					a.setBalance(bal1);
				}
			}
			
		}
		break;
		case 5:{
			System.out.println("Enter Account Number to be removed");
			Integer ac =sc.nextInt();
			for(Account a:accList) {
				if(ac.equals(a.getAccNo())) {
					accList.remove(a);
				}
			}
		}
		break;	
		case 6:{
			System.out.println("Enter Account No");
			int accN=sc.nextInt();
			for(Account a:accList) {
				if(a.getAccNo().equals(accN)) {
					if(a.getAt().equals(AccountType.SavingAccount)) {
						Double interest=a.getBalance()*0.04;
						System.out.println("Interest is : "+interest);
					}
					else {
						System.out.println("Interest is 0");
					}
				}
			}
		}
		break;
		case 7:{
			Collections.sort(accList,(o1,o2)->o1.getAccNo().compareTo(o2.getAccNo()));
			System.out.println(accList);
		}
		break;
		case 8:{
			Collections.sort(accList,(o1,o2)->o1.getDateOfOpening().compareTo(o2.getDateOfOpening()));
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
