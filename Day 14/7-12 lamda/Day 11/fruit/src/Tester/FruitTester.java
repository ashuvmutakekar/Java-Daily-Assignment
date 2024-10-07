package Tester;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

import fruit.Fruit;


public class FruitTester {
	public static void main(String[] args) {
		List<Fruit> fruitList =new ArrayList<Fruit>();
		try(Scanner sc=new Scanner(System.in)){
		while(true) {
		System.out.println("Enter choice:");
		System.out.println("1.Display list.");
		System.out.println("2.To add a fruit to list.");
		System.out.println("3. To remove a fruit from list.");
		System.out.println("4. To sort the fruits by colour");
		System.out.println("5. Sort frutis by quantity");
		System.out.println("6. Sort frutis by price");
		
		
		
		int choice=sc.nextInt();
		
		
			switch(choice) {
			case 1:{
				for(Fruit a:fruitList) {
					System.out.println(a);
				}
				System.out.println("List using for each:");
				fruitList.forEach(System.out::println);
				System.out.println("List using forward iterator:");
				ListIterator<Fruit> iterator=fruitList.listIterator();
				
				while(iterator.hasNext()) {
					Fruit f =iterator.next();
					System.out.println(f);
				}
				System.out.println("List using reverse iterator:");
				
				
				while(iterator.hasPrevious()) {
					Fruit f1= iterator.previous();
					System.out.println(f1);
				}
			}
			break;
			case 2:{
				sc.nextLine();
				System.out.println("Enter name of fruit:");
				String fname=sc.nextLine();
				System.out.println("Enter color of fruit:");
				String color=sc.nextLine();
				System.out.println("Enter price of fruit:");
				double price=sc.nextDouble();
				System.out.println("Enter quantity of fruit:");
				int quantity=sc.nextInt();
				Fruit f=new Fruit(fname,color,price,quantity);
				fruitList.add(f);
				System.out.println("Fruit added");
			}
			break;
			case 3:{
				System.out.println("Enter index of fruit to be removed:");
				int n=sc.nextInt();
				System.out.println(fruitList.remove(n));
				break;
			}
			case 4:
			{
				
				Collections.sort(fruitList);
				
				System.out.println("Sorted According to Color");
				System.out.println(fruitList);
			}
			break;
			case 5:{
				Collections.sort(fruitList, (o1,o2)->o1.getQuantity().compareTo(o2.getQuantity()));
				System.out.println(fruitList);
			}
			break;
			case 6:
			{
				Collections.sort(fruitList, (o1,o2)->o1.getPrice().compareTo(o2.getPrice()));
				System.out.println(fruitList);
			}
			default:
				System.out.println("Wrong Input");
			}
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
		}
}
