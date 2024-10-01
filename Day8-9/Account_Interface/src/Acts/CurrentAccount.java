package Acts;

import com.exp.MinimumBalanceException;

import Acts.Dac.Depositable;
import Acts.Dac.Withdrawable;
public class CurrentAccount extends Account implements Withdrawable ,Depositable {
  private final double interestRate=0.01;
  
  public CurrentAccount(String name,String dop,double ammount )
  {
	  super(name,dop,ammount);
	  
  }
  @Override
  public double applyInterest()
  {
	 return amount*interestRate; 
  }
  @Override
	 public double Deposit(double A) {
		amount=amount+A;
	 System.out.println("balance :"+amount);
		 return 0;
	 }

	@Override
	public double Withdraw(double A) {
		double minBal=500;
		amount=amount-A;
		try {
		     if(amount<minBal)
		     {
		        throw new MinimumBalanceException("Your balance is insufficient ");
		     }
		     System.out.println("balance :"+amount);
		}
		     catch(MinimumBalanceException e)
		     {
		    	 System.out.println(e.getMessage());
		     }
		
		return 0;
	}
}
