package acts;
import acts.Account;
public class CurrentAccount extends Account {
  private final double interestRate=0.01;
  
  public CurrentAccount(String name,String dop,double ammount )
  {
	  super(name,dop,ammount);
	  
  }
  @Override
  public double applyInterest()
  {
	 return ammount*interestRate; 
  }
	
}
