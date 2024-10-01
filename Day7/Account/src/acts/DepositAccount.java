package acts;
import acts.Account;
public class DepositAccount extends Account {
	 private final double interestRate=0.08;
	  
	  public DepositAccount(String name,String dop,double ammount )
	  {
		  super(name,dop,ammount);
		  
	  }
	  @Override
	  public double applyInterest()
	  {
		 return ammount*interestRate; 
	  }
	


}
