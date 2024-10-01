package acts;

public abstract class Account {
    int accno;
	String name;
	String dop;
	protected double ammount;
	public static int id=123456;
	public Account(String name,String dop,double ammount)
	{   this.accno=id++;
		this.name=name;
		this.dop=dop;
		this.ammount=ammount;
		
	}
	public abstract double applyInterest();
	
	public String toString() {
		 return "Account[accno="+ accno +",name = " + name +",Date of Opening = " + dop + "]";
		
	}
      
}
