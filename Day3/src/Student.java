import Marks.SubMarks;
import java.util.Scanner;
public class Student{
   int rollno;
   String name;
   static int no=1000;
   public Student()
   {
	  rollno=no++;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter name :");
	   name=sc.nextLine();    
	   
   }
   void Display(){
        System.out.println("Roll number :"+rollno);
	  
	   System.out.println(" Name :"+name);
	    
   }
  public static void main(String[] args){
 
	Student s=new Student();
	x
	
	s.Display();
	SubMarks.CalculateMarks();
	Student s1=new Student();
    s1.Display();
    SubMarks.CalculateMarks();
  }



}