package dac;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;








public class Tester {

	public static void main(String[] args) {
		List <JobSeeker> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		  int ch=0;
		  do {
			    System.out.println("1 .Registeration");
				System.out.println("2 .Display All Account");
				System.out.println("3 .Update Email");
				System.out.println("4 .Display all job seeker by theie degree type. take degree from user");
				System.out.println("5 .Sort JobSeeker details as per email ");
	            System.out.println("6 .Sort JobSeeker details as per dob");
	            System.out.println("7 .Sort customer details  as per graduationDate");
	            System.out.println("Enter your choice : ");
	            ch=sc.nextInt();
	            sc.nextLine();
			  
			  switch(ch) {
			  case 1:{
				     System.out.println("Enter name :");
	                String name=sc.nextLine();
	                System.out.println("Enter email :");
	                String email=sc.nextLine();
	                System.out.println("Enter password :");
	                String pass=sc.nextLine();
	                System.out.println("Enter adhar id :");
	                String adhar=sc.nextLine();
	                boolean x=ValidateFields.validatePhoneNo(adhar);
	                System.out.println("Enter Date of Birth :");
	                 String d1=sc.nextLine();
	                 LocalDate dob=ValidateFields.validateDob(d1);
	               
	                System.out.println("Enter phone no :");
	                String no=sc.nextLine();
	                boolean y=ValidateFields.validatePhoneNo(no);
	                System.out.println("Enter Date of graduation :");
	                 String d2=sc.nextLine();
	                LocalDate dog=ValidateFields.validateDog(d2);
	                System.out.println("Enter Degree BTech/BSC/BCA");
	                String t=sc.nextLine();
	                Degree degree=ValidateFields.validateDegree(t);
	               
	                if(dog ==null||dob == null||degree==null)
	                {
	                	System.out.println("Your data are invalid");
          }
                else{
	                	 
                	JobSeeker j = new JobSeeker(name, email, pass, dob, adhar, no, dog, degree);
                	boolean exist = false;

                	for (JobSeeker s : list) {
                	    if (s.getAadharId().equals(adhar)) {
                	        exist = true; 
                	        break;
                	    }
                	}

                	if (exist) {
                	    System.out.println("Already exist");
                	} else {
                	    list.add(j);
                	    System.out.println("Job Seeker Added Successfully");
                	}

	    	                     
	                		 
	                	 

	                }
	                
				  
			         }break;
			  
			  case 2:{
	            	for(JobSeeker a : list) {
						System.out.println(a);
						}
	                   }break;
			  case 3 :{
				  System.out.println("Update email:");
				  System.out.println("Enter old email");
				  String Old=sc.nextLine();
				  System.out.println("Enter new email");
				  String New=sc.nextLine();
				  for(JobSeeker j:list)
				  {
					  if(j.getEmail().equals(Old))
					  {
						  j.setEmail(New);
						  System.out.println("updated successfully");
						  break;
					  }
				  }
				  
			  }
			  break;
			  case 4:{
				      System.out.println("4 .Display all job seeker by theie degree type. take degree from user");
				        System.out.println("Enter Degree BTech/BSC/BCA");
		                String t=sc.nextLine();
		                Degree degree=ValidateFields.validateDegree(t);
		                boolean found = false; 
		                for (JobSeeker j : list) {
		                    if (j.getDegree().equals(degree)) {
		                        System.out.println(j);
		                        found = true; 
		                    }
		                }
		                
		                
		                if (!found) {
		                    System.out.println("No job seekers found with the degree: " + degree);
		                }
		                
			  }break;
			  case 5:{
				    System.out.println("Sort JobSeeker details as per email ");
				    Collections.sort(list);
			        }
			         break;
			  case 6:{
				  System.out.println(" sort JobSeeker details as per dob");
				  Collections.sort(list,new compareDob());
                  for(JobSeeker a: list) {
  					System.out.println(a);
  					}
		        }
		         break;
			  case 7:{
				  System.out.println("Sort JobSeeker details  as per graduationDate");
				  Collections.sort(list,new compareGod());
                  for(JobSeeker a: list) {
  					System.out.println(a);
  					}
			  }
		         break;
			 
			  }
			  
		  }while(ch<8);

	}

	
	}


