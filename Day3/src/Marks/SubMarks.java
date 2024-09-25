package Marks;
import java.util.Scanner;
public class SubMarks{
 public static void CalculateMarks()
 {
	  Scanner sc=new Scanner(System.in);
 System.out.println("Eneter Marks for 4 subject");
 int m1=sc.nextInt();
 int m2=sc.nextInt();
 int m3=sc.nextInt();
 int m4=sc.nextInt();
 int per=(m1+m2+m3+m4)/4;
 System.out.println("Result :");
 if(per>80)
 {
 System.out.println("Pass with distinction");
 }else if(per>60)
 {
  System.out.println("Pass with first class");
 }else if(per>40)
 {
  System.out.println("Pass with Second class");
 }
 else
 System.out.println("Fail");
 }
}