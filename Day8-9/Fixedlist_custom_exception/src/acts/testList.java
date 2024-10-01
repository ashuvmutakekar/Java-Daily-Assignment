package acts;
import java.util.Scanner;
public class testList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fixed_list f=new Fixed_list();
	   for(int i=0;i<10;i++)
	   {
		   System.out.println("Enter eklement :");
		   int a=sc.nextInt();
		   f.insert(a);
		  
	   }
	   for(int i=0;i<10;i++)
	   {
		   
		   f.retrive(i);
		  
	   }

	}

}
