package Acts;

import java.time.LocalDate;

import Dac.MinimumBalanceException;

public class Account implements Comparable<Account> {
    Integer accno;
    String name;
    LocalDate dop;
    Acc_Type type;
    Double balance;
    static int id=1234;
	public Account() {
		accno=id++;
		name ="";
		dop=null;
		balance=0.0;
			
	}
	public Account( String name, LocalDate dop,Acc_Type type, Double balance) {
		this.accno=id++;
		this.name = name;
		this.dop = dop;
		this.type=type;
		this.balance = balance;
	}
	
	public Integer getAccno() {
		return accno;
	}
	
	public String getName() {
		return name;
	}
	public Acc_Type getType() {
		return type;
	}
	
	public LocalDate getDop() {
		return dop;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	@Override
	public int compareTo(Account o)
	{
		return this.accno-o.accno;
	}
	
	 public double Deposit(double A) {
		balance=balance+A;
	 System.out.println("balance :"+balance);
		 return 0;
	 }


	public double Withdraw(double A) {
		double minBal=500;
		balance=balance-A;
		try {
		     if(balance<minBal)
		     {
		        throw new MinimumBalanceException("Your balance is insufficient ");
		     }
		     System.out.println("balance :"+balance);
		}
		     catch(MinimumBalanceException e)
		     {
		    	 System.out.println(e.getMessage());
		     }
		
		return 0;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", dop=" + dop + ",Type=" + type + ", balance=" + balance + "]";
	}
	
	
    
}
