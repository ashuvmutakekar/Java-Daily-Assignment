package dac;

public enum Degree {
BTech("Bachelor of Technology"),
BSC("Bachelor of Science"),
BCA("Bachelor of Computer");
	String str;
	private Degree(String str)
	{
	 this.str=str;	
	}
	public String getValue(String t)
	{
		return t;
	}
}	