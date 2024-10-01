package Acts;

import Acts.Dac.Maturable;
public class DepositAccount extends Account implements Maturable{
	 private final double interestRate=0.08;
	  
	  public DepositAccount(String name,String dop,double ammount )
	  {
		  super(name,dop,ammount);
		  
	  }
	  @Override
	  public double applyInterest()
	  {
		 return amount*interestRate; 
	  }
	@Override
	public double CalMaturityAmount(double A) {
		amount+=A;
		System.out.println("Maturity amount"+amount);
		return 0;
	}
	


}
