package acts;
import acts.Account;
public class SavingAccount extends Account {
	private final double interestRate=0.03;
	  
	  public SavingAccount(String name,String dop,double ammount )
	  {
		  super(name,dop,ammount);
		  
	  }
	  
	  @Override
	  public double applyInterest()
	  {
		 return ammount*interestRate; 
	  }
		
}
