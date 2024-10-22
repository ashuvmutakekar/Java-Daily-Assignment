package appleTester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import apple.Apple;

public class AppleTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Apple> appleList= new ArrayList<>();
		int ch;
		do {System.out.println("------Menu------");
		    System.out.println("0.Add Apple");
		    System.out.println("1.Display Apple");
		   System.out.println("2.Filter By Weight");
		   System.out.println("3.Filter By Colour");
		   System.out.println("4.Filter By Colour And Weight");
		   System.out.println("5. Filter By Colour,Weight and Taste");
		   System.out.println("6.Sort By weight");
		   System.out.println("7.Sort By Colour");
		   System.out.println("8.Remove REd Apples");
		   System.out.println("9. Remove Green Apples");
		   System.out.println("10.Conver To Set Collection");
		   System.out.println("Enter your Choice:");
		   ch=sc.nextInt();
		   sc.nextLine();
		   switch(ch) {
		   case 0:{
			System.out.println("Enter color");
			String color=sc.nextLine();
			System.out.println("Enter taste");
			String taste=sc.nextLine();
			System.out.println("Enter weight");
			Integer weight=sc.nextInt();
			appleList.add(new Apple( color,  taste,  weight));
			System.out.println("Added");
		   }
		   break;
		   case 1:{
			   appleList.forEach(System.out::println) ;
		   }
		   break;
		   case 2:{
			 
			   appleList.stream()
			   .filter((b)->b.getWeight()<100)
			   .forEach(System.out::println);
			   
		   }
		   break;
		   case 3:{
			   appleList.stream()
			   .filter((b)->b.getColor().equalsIgnoreCase("RED"))
				.forEach(System.out::println);	   
			   
		         }
		     break;
		   case 4:{
			   appleList.stream()
			   .filter((b)->b.getColor().equalsIgnoreCase("RED")&& b.getWeight()<100)
				.forEach(System.out::println);	   
			   
		         }
		     break;
		   case 5:{
			   appleList.stream()
			   .filter((b)->b.getColor().equalsIgnoreCase("RED")&& b.getWeight()<100 && b.getTaste().equalsIgnoreCase("sweet"))
				.forEach(System.out::println);	   
			   
		         }
		     break;
		   case 6:{
			   appleList.stream()
			   .sorted((o1,o2)->o1.getWeight().compareTo(o2.getWeight()))
			   .forEach(System.out::println);
		   }
		     break;
		   case 7:{
			   appleList.stream()
			   .sorted((o1,o2)->o1.getColor().compareTo(o2.getColor()))
			   .forEach(System.out::println);
		   }
		   break;
		   case 8: {
			   appleList.stream()
			   .filter((b)->!b.getColor().equalsIgnoreCase("RED"))
				.forEach(System.out::println);	  
			   
		   }  
		   break;
		   case 9: {
			   appleList.stream()
			   .filter((b)->!b.getColor().equalsIgnoreCase("Green"))
				.forEach(System.out::println);	  
			   
		   } 
		   break;
		   case 10:{
			   Stream<Apple> str=appleList.stream();
			   Set<Apple> set=str.collect(Collectors.toSet());
			   set.forEach(System.out::println);
			   
			   
		   }
		   break;
		   }
		}while(ch<11);
	}

}
