import college.Student;
import java.util.Scanner;
public class StudentInfo {

	public static void main(String[] args) {
		Student s[] = new Student[20];
		Scanner sc=new Scanner(System.in);
        int count = 0;
        int ch = 0;
        do {
        	System.out.println("--------------------------------------Student DataBase--------------------------------------------------s");
        	 System.out.println( "1 .Add Student 2 . Display Student  3 .Sort Student By Marks  4 .Sort Student through through fees "  );
             System.out.println("Choice :");
             ch=sc.nextInt();
             sc.nextLine();
        	 switch(ch) {
        	 case 1 : {  System.out.println("-----------Add Student-------------------");
        		         System.out.println(" Enter name :");
        		         String name = sc.nextLine();
        		         System.out.println(" Enter Department :");
        		         String dept = sc.nextLine();
        		         System.out.println(" Enter fees :");
        		         double fees = sc.nextDouble();
        		         s[count]=new Student(name,dept,fees);
        		         System.out.println("*****MARKS********");
        		        s[count].CalculateMarks();       		         
        		        System.out.println("Student added successfully at roll number :" + s[count].getRoll());
        		        count++;
        	          } 
        	           break;
        	 
        	 case 2 : {
        		          System.out.println(" Enter the roll number of student to get details : ");
        		          int no=sc.nextInt();
        		          for( int i=0 ; i<count ; i++ ) {
        		        	  if(s[i].getRoll() == no )
        		        	  {
        		        		  s[i].printData();
        		        	  }
        		        	  
        		          }
        		         
        		 
	                  } 
	                   break;
        	 case 3 : {
        		       System.out.println("*********************Sort through percentage ********************");
		           
		                for( int i=0 ; i<count ; i++ ) {
		        	     for( int j=i+1 ; j<count ; j++) {
		        	      if( s[i].getPer() > s[j].getPer() )
		        	    {
		        		  Student temp = s[i];
		        		  s[i] =  s[j];
		        		  s[j] = temp;
		        	    }
		              }
		        	  
		           }
		           System.out.println(" Sorted student by percentage :");
		           for( int i=0 ; i<count ; i++ ) {
		        	   
		            s[i].printData();
		        	  
		          }
        		 
                      } 
                      break;

        	 case 4 : {
        		         
        		           System.out.println("--------------------Sort through fees --------------------------");
        		           
        		           for( int i=0 ; i<count ; i++ ) {
        		        	   for( int j=i+1 ; j<count ; j++) {
         		        	  if( s[i].getFees() > s[j].getFees() )
         		        	  {
         		        		  Student temp = s[i];
         		        		  s[i] =  s[j];
         		        		  s[j] = temp;
         		        	  }
        		            }
         		        	  
         		          }
        		           System.out.println(" Sorted student by fees :");
        		           for( int i=0 ; i<count ; i++ ) {
        		        	   
        		            s[i].printData();
         		        	  
         		          }
                      } 
                      break;
             default : break;

        	 }
        	
        	
        	
        } while (ch != 0);
	}

}
