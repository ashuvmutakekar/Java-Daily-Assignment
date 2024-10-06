package Acts;

import java.time.LocalDate;

public class Account implements Comparable<Account> {
    Integer accno;
    String name;
    LocalDate dop;
    Double balance;
    static int id=1234;
	public Account() {
		accno=id++;
		name ="";
		dop=null;
		balance=0.0;
			
	}
	public Account( String name, LocalDate dop, Double balance) {
		this.accno=id++;
		this.name = name;
		this.dop = dop;
		this.balance = balance;
	}
	
	public Integer getAccno() {
		return accno;
	}
	
	public String getName() {
		return name;
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
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", dop=" + dop + ", balance=" + balance + "]";
	}
	
	
    
}
