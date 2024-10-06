package dac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <Fruit> FruitList= new ArrayList <Fruit> ();
	    
		
	    
		int ch=0;
   do {
	   System.out.println("1 .Add fruits");
	  
	   System.out.println("2 .Get All");
	  
	   System.out.println("5. Sort Fruit by Color");
	   System.out.println("6. sort by Quantity");
	   System.out.println("7. sort by price");
	  
	   System.out.println("Enter choice :");
	   ch=sc.nextInt();
	   int i=0;
	 
	   switch(ch) {
	   
	   case 1:{
		        
		        	
			        	
		        	System.out.println("Enter fruit informatiuon :");
			        System.out.println("Enter name :");
			        sc.nextLine();
			        
			        String name=sc.nextLine();
			        System.out.println("Enter color :");
			      
			        String color=sc.nextLine();
			        System.out.println("Enter price :");
			        double price=sc.nextDouble();
			        System.out.println("Enter Quality :");
			        int quantity=sc.nextInt();
			         
			        Fruit f=new Fruit(name,color,price,quantity);
			        FruitList.add(i,f);
			        System.out.println("Fruits Added successfully");
			        
	   }
		      break;
	   
		       
		        case 2: {
		        	 System.out.println("Enter Index to get all fruits by for each");
		        	 FruitList.forEach(System.out::println);
		        } break;
		        	       
		        case 3:   {
		        	
	        	       Collections.sort(FruitList ,new CompareColor());
	        	
	            }
	             break;
		        case 4:   {
		        	
	        	       Collections.sort(FruitList ,new CompareQuantity());
	        	
	            }
	             break;
		        case 5:   {
		        	
	        	       Collections.sort(FruitList ,new ComparePrice());
	        	
	            }
	             break;
	   
	   
	   	
	   }
	 
   
   } while(ch<10);
	    
	 
	 
   

		

	
}

}
