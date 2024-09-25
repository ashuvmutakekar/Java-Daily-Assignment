package college;
import java.util.Scanner;
public class Student {

   int rollno;
   String name;
   String dept;
   double fees;
   int per;
   static int id=100;
 
   public Student( String name ,String dept,double fees) {
	   this.rollno=id++;
	   this.name = name;
	   this.dept = dept;
	   this.fees = fees;
	   this.per=0;
   }
   public void printData () {
	   System.out.println("------------------------------");
	   System.out.println( " Roll number : " + rollno );
	   System.out.println( " Name : " + name );
	   System.out.println ( "Departmenr: " + dept );
	   System.out.println( " Fees : " + fees );
	   System.out.println("Percentage :" + per);
   }
   public int getRoll()
   {
	   return rollno;
   }
   public double getFees()
   {
	   return fees;
   }
   public int getPer()
   {
	   return per;
   }
   public void CalculateMarks()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Eneter Marks for 4 subject :-");
       int m1=sc.nextInt();
       int m2=sc.nextInt();
       int m3=sc.nextInt();
       int m4=sc.nextInt();
       per =(m1+m2+m3+m4)/4;
   
      System.out.println("**************Result****************** :");
      if( per > 80 ) {
         System.out.println("Pass with distinction");
       } else  
       
       if( per > 60 ) {
         System.out.println("Pass with first class");
       } else 
       
       if( per > 40 ) {
         System.out.println("Pass with Second class");
       } else
         System.out.println("Fail");
   }
  
   
   
}
