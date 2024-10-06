package Tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import Acts.Student;
import Acts.StudentNotFoundException;

public class StudentTester_TM {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	  Map<String,Student> map=new TreeMap<>();
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
			  String key=std+div+rollno;
			  System.out.println(key);
			  Student a=new Student(key, rollno, name, std, div);
			  map.put(key, a);
			  System.out.println("Added successfully");
			  
		  }break;
		  
		  case 2:{
			       System.out.println("Enter key for get student");
			       String str=sc.nextLine();
			       Collection<Student> slist=map.values();
			       try {
			    	  for(Student a:slist)
			    	  {
			    		  if(a.getKey().equals(str))
			    		  {
			    			  System.out.println(a);
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
