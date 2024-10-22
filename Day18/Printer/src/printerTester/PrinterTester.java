package printerTester;



import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


import printer.Printer;
import printer.PrinterType;




public class PrinterTester {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	try(Scanner sc=new Scanner(System.in);)
	{
		System.out.println("Enter file name");
		String name=sc.nextLine();
		File f=new File(name);
		
	  Map<String,Printer> map = new HashMap<>();
	int ch;
	do {
		System.out.println("----Menu----");
		System.out.println("1.Add Printer");
		System.out.println("2.Update printer price");
		System.out.println(" 3.Print all Printers");
		System.out.println("4.Display printers sorted by Prices");
		System.out.println("5.Filter by printerType ");
		System.out.println(" 6.Remove a printer");
		System.out.println(" 7. Show printer by PrinterType");
		System.out.println(" 8.Save in file ");
		System.out.println(" 9.Read in file and Exit");
		System.out.println("Enter choice");
		ch=sc.nextInt();
		
		switch(ch){
		  case 1:{
			    System.out.println("Enter serial no");
				String sno = sc.next();

				System.out.println("Enter Model no");
				Integer model = sc.nextInt();

				

				System.out.println("Enter Printer Type");
				String pType = sc.next();
                PrinterType b=PrinterType.valueOf(pType);
				
				System.out.println("Enter Price");
				Double price = sc.nextDouble();
				
				System.out.println("Enter manufacturing date in yyyy-MM-dd format");
				String manDate = sc.next();
				LocalDate d=LocalDate.parse(manDate);
				
				
				
				map.put(sno,new Printer( sno, model, price , b, d));
		  }
		  break;
		  case 2:{
			  System.out.println("Update Printer Price");
			  System.out.println("Enter serial No of Printer");
			  String sNo=sc.next();
			  map.get(sNo).setPrice(67.0);
			  System.out.println(map.get(sNo));
			 
		  }
		  break;
		  case 3:{
			  System.out.println(map);
		  }break;
		  case 4:{
			    List<Printer> list = new ArrayList<>(map.values());
			      list.stream()
			        .sorted((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()))
			        .forEach(System.out::println);		  
		  } 
		  break;
		  case 5:{
			  List<Printer> list = new ArrayList<>(map.values());
		      list.stream()
		       .filter((g)->g.getPt().toString().equals("LASER"))
		        .forEach(System.out::println);
		  }
			  break;
		  case 6:{
			  List<Printer> list = new ArrayList<>(map.values());
				  System.out.println("Enter serial No of Printer");
				  String sNo=sc.next();
				  list.stream().filter((g)->!(g.getSerialNo().equals(sNo)))
				  .forEach(System.out::println);
	      }  
			 break; 
		  case 7:{
			  List<Printer> list = new ArrayList<>(map.values());
			   list.stream()
			  .collect(Collectors.groupingBy(Printer::getPt));
		  }
		  break;
		  case 8:{
				try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f))){
			  List<Printer> list = new ArrayList<>(map.values());
			  for(Printer p:list)
			  {
				  p.writeExternal(oos);
			  }
			  System.out.println("Sucessfully add");
		  }
		  }
		  break;
		  case 9:{
			  try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(name))) {
				   Map<String,Printer> pmap=new HashMap<>();
				  while(ois.read()!=null)
					 {
		              Printer p=new Printer();
		              p.readExternal(ois);
		             pmap.put(p.getSerialNo(), p);
					 }
				  System.out.println(pmap);
		         }catch(EOFException e)
				 {
		        	 System.out.println(e.getMessage());
				 }
				
			  
		  }
		  
		  break;
			  
		  }
		  
		  
	  }while(ch<10);
	
}
}
}
