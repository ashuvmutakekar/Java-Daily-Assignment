import java.util.Scanner;
public class Grade{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter marks for four subject :");
   int m1=sc.nextInt();
    int m2=sc.nextInt();
	 int m3=sc.nextInt();
	  int m4=sc.nextInt();
	  int per=(m1+m2+m3+m4)/4;
	  if(per>75)
	  {
	  System.out.println("Pass with distinction");
	  }
	  else if(per>60)
	  {
	  System.out.println("Pass with First class");
	  }
	  else if(per>50)
	  {
	  System.out.println("Pass with Second class");
	  }
	  else{
	  System.out.println("Pass");
	  }
	  
 
 }


}