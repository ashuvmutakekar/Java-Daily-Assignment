package dirCheck;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReadWrite {
		public static String text;
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		
		System.out.println("Enter name of file :");
		String filename=sc.nextLine();
		System.out.println("Enter name of file you want to copy :");
		String filename1=sc.nextLine();
		
		try(PrintWriter pw=new PrintWriter(new FileWriter(filename,true));
				BufferedReader br=new BufferedReader(new FileReader(filename));
				PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter(filename1,true))))
				
		{
	
		     File file1 =new File(filename); 
		
			if(!file1.exists()) {
				
					file1.createNewFile();
					System.out.println("File1 is created");      
	        }
			System.out.println("Enter text if you data entry complete enter exit");
			text=sc.next();
			while(!text.equals("exit"))
			{
				pw.println(text);
				text=sc.next();
				
			}
			System.out.println("Data Entered");
			
			  File file2 =new File(filename1); 
				
				if(!file2.exists()) {
					
						file2.createNewFile();
						System.out.println("File2 is created");      
		        }
				while((text=br.readLine())!=null)
				{
					pw1.println(text);
					
				}
				System.out.println("data is copied");
				
			} 
		}catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	

