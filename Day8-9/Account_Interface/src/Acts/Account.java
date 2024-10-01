package Acts;

import com.exp.MinimumBalanceException;

public abstract class Account  {
    int accno;
	String name;
	String dop;
	protected double amount;
	public static int id=123456;
	public Account(String name,String dop,double amount)
	{   this.accno=id++;
		this.name=name;
		this.dop=dop;
		double minBal=500;
		try {
		     if(amount<minBal)
		     {
		        throw new MinimumBalanceException("Your balance is insufficient ");
		     }
		}
		     catch(MinimumBalanceException e)
		     {
		    	 System.out.println(e.getMessage());
		     }
		
		this.amount=amount;
		
}
	public abstract double applyInterest();
	
	public String toString() {
		 return "Account[accno="+ accno +",name = " + name +",Date of Opening = " + dop + "]";
		
	}
	
      
}
