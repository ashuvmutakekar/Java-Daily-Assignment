import java.util.Scanner;
public class Interest{
 public static void Simple(int p,int r,int t)
 {
  
    int si=(p*r*t)/100;
    System.out.println("SI :"+si);
 
 
 }
public static void Compound(int p,int r,int t)
 {
      int x=(1+(r/100));
      int count=0;
      while(count<=t)
      {
       x*=x;
       count++;     
      }
      int Ammount=p*x;
      //int ci=Ammount-p;
    System.out.println("Ammount"+Ammount);



 }

public static void main(String args[])
{
   
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the p:");
 int p=sc.nextInt();
 System.out.println("Enter the R:");
 int r=sc.nextInt();
 System.out.println("Enter the T:");
 int t=sc.nextInt();
 
 System.out.println("1 .Simple Intesrest \n 2..Compound Interest  ");
System.out.println("Enter your choice :");
 int ch=sc.nextInt();

 switch(ch)
 {
	 case 1: Simple(p,r,t);
		 break;
         case 2:Compound(p,r,t);
		break;
	 default:break;
 
 }

}

}
