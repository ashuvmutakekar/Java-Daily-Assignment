package dirCheck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFile {
		public static String text;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of file you want to read:");
		String filename=sc.nextLine();
		try(
				BufferedReader br=new BufferedReader(new FileReader(filename));
				PrintWriter pw= new PrintWriter(System.out);
				)
		{
	
		     File file =new File(filename); 
		
			if(!file.exists()) {
				
				
					System.out.println("File is not exist");      
	        }
			
			while((text=br.readLine())!=null)
			{
				pw.println(text);
				
			}
			System.out.println("Data in the file");
			
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	

