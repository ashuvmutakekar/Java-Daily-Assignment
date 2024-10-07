package Tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Acts.Student;
import Acts.StudentKey;
import Acts.StudentNotFoundException;

public class StudentTester_HM {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	  Map<StudentKey,Student> map=new HashMap<>();
	  int ch;
	  do {
		    System.out.println("----Menu---");
		    System.out.println("1. add Student");
		    System.out.println("2 .Find Student");
		    System.out.println("3 .Print all Student");
		    System.out.println("Enter choice");
		    ch=sc.nextInt();
		    sc.nextLine();
		  
		  switch(ch) {
		  
		  case 1:{
			  System.out.println("Enter rolno :");
			  Integer rollno=sc.nextInt();
			  sc.nextLine();
			  System.out.println("Enter name :");
			  String name=sc.nextLine();
			  System.out.println("Enter Standard :");
			  String std=sc.nextLine();
			  System.out.println("Enter Division :");
			  String div=sc.nextLine();
			 
			  Student a=new Student(div,std,rollno,name);
			  //StudentKey b=(StudentKey) a;
			  
			  
			  map.put(a.getKey(), a);
			  System.out.println("Added successfully");
			  
		  }break;
		  
		  case 2:{
			       System.out.println("Enter division");
			       String div=sc.nextLine();
			       System.out.println("Enter Standard");
			       String std=sc.nextLine();
			       System.out.println("Enter roll number");
			       Integer rollno=sc.nextInt();
			       StudentKey sk=new StudentKey(div,std,rollno);
			      
			       Collection<Student> slist=map.values();
			       try {
			    	  for(Student a:slist)
			    	  {
			    		  if(a.getKey().equals(sk))
			    		  {
			    			  System.out.println("The name of student is: "+ a.getName());
			    			  break;
			    		  }
			    		  else
			    		  {
			    			  throw new StudentNotFoundException("Student not found");
			    		  }
			    	  }
			       }catch(StudentNotFoundException e)
			       {
			    	   System.out.println(e.getMessage());
			       }
			       
		       }break;
         case 3:{
        	 Collection<Student> slist=map.values();
		       
		    	  for(Student a:slist)
		    	  {
		    		 
		    		  
		    			  System.out.println(a);
		    		  
		    		  
		    	  }
		       }
		      break;
		  
		  }
		  
		  
		  
		  
	  }while(ch<4);
	 
 }
}
