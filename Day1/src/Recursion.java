import java.util.Scanner;
public class Recursion{
	public static int Rec(int n)
	{  if(n==0)
		return 1;
		return (n*Rec(n-1));
	}
	public static void RecSeries(int n)
	{
		for(int i=0;i<=n;i++)
		{
		  System.out.println(Rec(i));
		}
		
	}
	public static void main(String[] args)
	{
		System.out.println("Enter number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	     Recursion.Rec(n);
Recursion.RecSeries(n);		 
	}
}