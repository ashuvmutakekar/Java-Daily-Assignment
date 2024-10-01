package Acts;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <Fruit> FruitList= new ArrayList <Fruit> ();
	    
		
	    
		int ch=0;
   do {
	   System.out.println("1 .Add fruits");
	   System.out.println("2 .Get by index");
	   System.out.println("3 .Get All");
	   System.out.println("4 .Remove by index");
	   System.out.println("5. Using For Each");
	   System.out.println("6. Using Advance For Loop");
	   System.out.println("7. Using For Loop");
	   System.out.println("8. Using Advance forward iteration");
	   System.out.println("9. Using Backward iteration");
	   System.out.println("Enter choice :");
	   ch=sc.nextInt();
	   int i=0;
	   String choice="Y";
	   switch(ch) {
	   
	   case 1:{
		        while(choice=="Y")
		        {
		        	
			        	
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
			        System.out.println("Enter choice if you want to add Enter Y/N :");
			        choice=sc.nextLine();
			        
			       
		        }
		      break;
	   }
		        case 2:{
		        	
		        	       System.out.println("Enter Index to get");
		        	       int x=sc.nextInt();
		                  Fruit f1= FruitList.get(x);
		                  System.out.println(f1);
		        	
		        }
		        break;
		        case 3: {
		        	 System.out.println("Enter Index to get all fruits by for each");
		        	 FruitList.forEach(System.out::println);
		        } break;
		        	       
		        case 4:   {
		        	
	        	       System.out.println("Enter Index to get");
	        	       int x=sc.nextInt();
	                   FruitList.remove(x);
	                  FruitList.forEach(System.out::println);
	        	
	            }
	             break;
	          
		        case 5: {
		        	 System.out.println("Enter Index to get all fruits by for loop");
		        	 FruitList.forEach(System.out::println);
		        } break;

		        case 6: {
		        	 System.out.println("Enter Index to get all fruits by advanced for loop");
		        	 for(Fruit f :FruitList) {
		        		 System.out.println(f);
		        	 }
		        } break;
		        case 7: {
		        	 System.out.println("Enter Index to get all fruits by for loop");
		        	 for(int k=0;k<FruitList.size();k++) {
		        		
		        		 System.out.println(FruitList.get(k));
		        	 }
		        } break;
		        case 8: {
		        	 System.out.println("Enter Index to get all fruits by forby Forward iteration");
		        	 ListIterator<Fruit> it =FruitList.listIterator();
		        	 while(it.hasNext())
		        	 {
		        		 
		        		 Fruit f=it.next();
		        		 System.out.println(f);
;		        	 }
		        } break;  
		        case 9: {
		        	 System.out.println("Enter Index to get all fruits by forby Backward iteration");
		        	
		        	 ListIterator<Fruit> it =FruitList.listIterator(FruitList.size());
		        	 while(it.hasPrevious())
		        	 {
		        		 
		        		 Fruit f=it.previous();
		        	    
		        		 System.out.println(f);
;		        	 }
		        } break; 
	   
	   }
	   
	   	
	   
	 
   
   } while(ch<10);
	    
	 
	 
 }

	

	
}


