package Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamuseString {
public static void main(String[] args) {
	List<String> list=new ArrayList<>(Arrays.asList("Sunita","Anita","Anita","Vinita","Kavita"));
	//Distinct
	System.out.println("Distinct->");
	 list.stream()
	 .distinct()
     .forEach(System.out::println);
	 System.out.println();
	    //UpperCase
		 System.out.println("UpperCase->");
		 list.stream()
		 .map((s)->s.toUpperCase())
	     .forEach(System.out::println);
		   System.out.println();
		//Start with Su
		 System.out.println("Start with Su->");
		 list.stream()
		 .filter((s)->s.startsWith("Su"))
	     .forEach(System.out::println);
		 System.out.println();
		//Concat all string
		 System.out.println("Concat all string->");
		 String str =list.stream()
		 .reduce("",(s,s2)->s.concat(s2));
		 System.out.println(str);
		 System.out.println();
	     
		 
		//filter by end with
		 System.out.println("filter by end with nita->");
		 list.stream()
		.filter((s)->s.endsWith("nita"))
	     .forEach(System.out::println);
}
}
