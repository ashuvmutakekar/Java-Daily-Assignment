package Acts;

public enum Acc_Type {
SA("Saving Account"),
CA("Current Account"),
DA("Current Account");
	String str;
	private Acc_Type(String str)
	{
	 this.str=str;	
	}
	public String getValue(String t)
	{
		return t;
	}
}	