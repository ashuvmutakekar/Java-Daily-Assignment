package libTester;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.time.LocalDate.parse;
import static lib.BookType.Thesis;
import static lib.BookType.GeneralInterest;
import static lib.BookType.HandBook;
import static lib.BookType.Proffesional;
import lib.Book;
import lib.BookType;
import lib.BookUtil;

public class BookTester {
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter file name :");
            String filename = sc.nextLine();
            File file = new File(filename);
            if (!file.exists()) {
                file.createNewFile();
            }
           
					   {
				       List<Book> list = new ArrayList<>();

				       int ch;
				    do {
				 	System.out.println("0.Add books");
					System.out.println("1.Display books");
					System.out.println("2.Save Book in a file");
					System.out.println("3.Save many book in a file");
					System.out.println("4.Read books");
					System.out.println("enter choice :");
					ch = sc.nextInt();
					sc.nextLine();
					switch (ch) {
					case 0: {
						System.out.println("Enter ISBN");
						String isbn = sc.nextLine();

						System.out.println("Enter Title");
						String title = sc.nextLine();

						System.out.println("Enter Book Type");
						String bookType = sc.nextLine();
						BookType b = BookType.valueOf(bookType);

						System.out.println("Enter Price");
						Double price = sc.nextDouble();
                         sc.nextLine();
						System.out.println("Enter publish date in yyyy-MM-dd format");
						String publishDate = sc.nextLine();
						LocalDate d = LocalDate.parse(publishDate);

						System.out.println("Enter Author");
						String author = sc.nextLine();

						list.add(new Book(isbn, title, b, price, d, author));
						System.out.println("Book Added Successfully");
					}
						break;
					case 1: {
						list.forEach(System.out::println);
					}
						break;
					case 2: {
						 try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));)
						 {
						System.out.println("Add one book ata a time");
						Book b1 = new Book("1234456", "JAVA", Thesis, 2500.00, parse("2010-04-24"), "Praful");
						BookUtil.SaveBook(b1, dos);

					} catch (IOException e) {
						System.err.println(e.getMessage());
					}
					}break;
					case 3: {
						 try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));)
						 {System.out.println("Add multiple book ");

						   BookUtil.SaveBookList(list, dos);
					     }catch (IOException e) {
								System.err.println(e.getMessage());
					     }}
						break;
					case 4:{
						System.out.println("Enter file name you want to read");
						String name=sc.nextLine();
						File file1=new File(name);
						if(file1.exists())
						{
					
					   {
						int h;
						do {
						System.out.println("1. Read only one Book " );
						System.out.println("2. Read all book");
						System.out.println("3. exit");
						System.out.println("Enter choice");
						h=sc.nextInt();
					
					     switch(h) {
					    
					    case 1: {
						     System.out.println("Read object from file");
						     try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file1)));)
						     {Book b1 = BookUtil.ReadBook(dis);

						     System.out.println(b1);

						     }  catch(IOException e)
								{
								  System.err.println(e.getMessage());
								}
				         
						     
					         }
						     break;
					     case 2: {
						      System.out.println("Read object from file");
						  	try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file1)));)
						  	{
						      List<Book> b1 = (List<Book>) BookUtil.ReadBookList(dis);
						      b1.forEach(System.out::println);
						     
					        }
					     catch(IOException e)
							{
							  System.err.println(e.getMessage());
							}
					     }
						     break;
					     case 3:
					    	 break;
					     
					    
						}
						}
					     while(h!=3);
						
						}
						}
						else
						{
							System.out.println("Not exists");
						}
						
						}
					break;
					
					}
                 
				} while (ch!=0);
			}
		

	}
	}}
