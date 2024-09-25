import java.util.Scanner;
public class Operation
{
  public static void Add(int a,int b)
  {
    System.out.println("Addition:"+(a+b));
  
  }
  public static void Sub(int a,int b)
  {
    System.out.println("Substraction:"+(a-b));

  }
  public static void Mul(int a,int b)
  {
    System.out.println("Multiplicatio:"+(a*b));

  }
  public static void Div(int a,int b)
  {
    System.out.println("Division:"+(a/b));

  }

 public static void main (String[] args)
 {
    System.out.println("Enter two numbers for operation :");
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    System.out.println("1. Addition  2.Substraction  3.Multiplication  4.Division ");
    
    System.out.println("Enter your choice :");
    int ch=nextInt();
    
     switch(ch) 
   {
     case 1:Operation.Add(n1,n2);
	    break;
     case 2:Operation.Sub(n1,n2);
            break;
     case 3:Operation.Mul(n1,n2);
            break;
     case 4:Operation.Div(n1,n2);
            break;
     default:
	     break;
   
   
   }
 



 }}
