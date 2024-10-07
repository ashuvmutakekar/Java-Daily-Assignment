package JobTester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import jobPortal.Degree;
import jobPortal.JobSeeker;

public class JobTester {
	public static void main(String[] args) {
		List<JobSeeker> js =new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your Choice:");
			System.out.println("1. To Register");
			System.out.println("2. To Update Email");
			System.out.println("3. To Display all by degree type");
			System.out.println("4. To sort by Email");
			System.out.println("5. To sort by Date of Birth");
			System.out.println("6. To sort by Graduation Date");
			System.out.println("0. Exit");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:{
				
				System.out.println("Enter Registration no");
				Integer regN=sc.nextInt();
				JobSeeker jss=new JobSeeker();
				jss.setRegId(regN);
				if(!js.contains(jss) ) {
					
				
				sc.nextLine();
				System.out.println("Enter Name");
				String name =sc.nextLine();
				System.out.println("Enter Email");
				String email = sc.nextLine();
				System.out.println("Enter Password");
				String pass = sc.nextLine();
				System.out.println("Enter Date Of Birth in yyyy-mm-dd format");
				String dob1= sc.nextLine();
				LocalDate dob = Validation.validateDob(LocalDate.parse(dob1));
				System.out.println("Enter AadharId");
				Double aad =sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter Graduation Date in yyyy-mm-dd format");
				String gd1= sc.nextLine();
				LocalDate gd = Validation.validateDoG(LocalDate.parse(gd1));
				System.out.println("Enter Phone No");
				String pn= Validation.validatePhoneNo(sc.nextLine());
				System.out.println("Enter Degree");
				String d =sc.nextLine();
				Degree deg=Degree.valueOf(d);
				
				JobSeeker jsk=new JobSeeker(regN, name, email, pass, dob, aad, pn, gd, deg);
				js.add(Validation.validateDuplication(jsk, js));
				}
				else {
					System.out.println("Duplicate");
				}
				}
			break;
			case 2:{
				System.out.println("Enter Registration No");
				int rg =sc.nextInt();
				sc.nextLine();
				for(JobSeeker j:js) {
					if(j.getRegId().equals(rg)) {
						System.out.println("Enter New email");
						String e = sc.nextLine();
						j.setEmail(e);
					}
				}
			}
				break;
				case 3:{
					System.out.println("Enter Degree Type");
					String d=sc.next();
					Degree deg = Degree.valueOf(d);
					for(JobSeeker j:js) {
						if(j.getDegree().equals(deg)) {
							System.out.println(j);
						}
						
					}
				}
				break;
				case 4:
				{
					Collections.sort(js);
					System.out.println(js);
				}
				break;
				case 5:
				{
					Collections.sort(js,(o1,o2)->o1.getDob().compareTo(o2.getDob()));;
					System.out.println(js);
				}
				break;
				case 6:
				{
					Collections.sort(js,(o1,o2)->o1.getGradDate().compareTo(o2.getGradDate()));
					System.out.println(js);
				}
				break;
				case 0:
					return;
				default:
					System.out.println("Invalid Input");
			}
			}
			
		}
	}

