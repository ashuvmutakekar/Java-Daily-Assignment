package dirCheck;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

public class CreateNew {
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of file :");
		String filename=sc.nextLine();
	
		File file =new File(filename); 
		
			if(!file.exists()) {
				try {
					file.createNewFile();
					System.out.println("File is created");

				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
	        System.out.println(file.getPath());
	        System.out.println("CreateNew.main()");
			file.deleteOnExit();
			System.out.println("File is deleted");
			
	}
	
}
