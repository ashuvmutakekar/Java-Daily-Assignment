package dirCheck;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DirCheck {
		
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
	         if(file.isDirectory()) {
				String[] arr  = file.list();
				System.out.println(Arrays.toString(arr));
				System.out.println("files Ends with zip");
				String[] arr1=file.list((dir,z)->z.endsWith(".zip"));
				System.out.println(Arrays.toString(arr1));
		}
	else {
		System.out.println("Not a directory");
	}
			
			
	}
	
}
