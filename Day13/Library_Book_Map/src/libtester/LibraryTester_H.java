package libtester;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Library.BookNotFoundException;
import Library.BookType;
import Library.Library;

public class LibraryTester_H {
	
	public static void main(String[] args)  {
		Map<String,Library> lib = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("1. Add Book");
			System.out.println("2. Display all Books");
			System.out.println("3. Allot Book to Student");
			System.out.println("4. Take Book Return");
			System.out.println("5. Remove Book");
			System.out.println("0. Exit.");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			sc.nextLine();
			switch(ch) {
			case 1:
			{
				System.out.println("Enter title:");
				String title=sc.nextLine();
				System.out.println("Enter BookType:");
				String bt1 =sc.nextLine();
				BookType bt =BookType.valueOf(bt1);
				System.out.println("Enter Price:");
				Double pr = sc.nextDouble();
				sc.nextLine();
			
				System.out.println("Enter Published Date:");
				String pd=sc.nextLine();
				LocalDate pd1=LocalDate.parse(pd);
				System.out.println("Enter Author Name:");
				String auth =sc.nextLine();
				System.out.println("Enter Quantity:");
				Integer q =sc.nextInt();
				Library l = new Library(title, bt, pr, pd1, auth, q);
				lib.put(title, l);
				boolean x=false;
			Collection<Library>titles=lib.values();
			for(Library a:titles) {
					if(a.getTitle().equals(title)){
						System.out.println("Duplicate");
						x=true;
						break;
					}
				}
				if(x==false)
				{
				lib.put(title, l);
			 	System.out.println("added");
				}
				else
				{
					break;
				}
			}
			break;
			case 2:{
				Collection<Library>titles=lib.values();
				System.out.println(titles);
			}
			break;
			case 3:{
				
				System.out.println("Enter book title you want :");
				String t=sc.nextLine();
				Collection<Library>titles=lib.values();
				try {
				for(Library a:titles)
				{
					if(a.getTitle().equals(t)) {
						Integer x=a.getQuantity()-1;
						a.setQuantity(x);
						System.out.println(lib);
						break;
					}
					else
					{
					  throw new BookNotFoundException("Not found");
					}
				}
				}catch(BookNotFoundException e)
				{
					System.out.println(e.getMessage());
				}
				
			} break;
			case 4:{
				System.out.println("Enter book title you want to submit :");
				String t=sc.nextLine();
				Collection<Library>titles=lib.values();
				try {
				for(Library a:titles)
				{
					if(a.getTitle().equals(t)) {
						Integer x=a.getQuantity()+1;
						a.setQuantity(x);
						System.out.println(lib);
						break;
					}else
					{
						  throw new BookNotFoundException("Not found");
						}
				}
				}catch(BookNotFoundException e)
				{
					System.out.println(e.getMessage());
				}
				
			} break;
			case 5:{
				System.out.println("Enter book title you want to remove :");
				String t=sc.nextLine();
				Collection<Library>titles=lib.values();
				try {
				for(Library a:titles)
				{
					if(a.getTitle().equals(t)) {
						lib.remove(t);
						System.out.println(lib);
						break;
					}else
					{
						  throw new BookNotFoundException("Not found");
						}
				}
				}catch(BookNotFoundException e)
				{
					System.out.println(e.getMessage());
				}
			} break;
			}
		}
	}
}
