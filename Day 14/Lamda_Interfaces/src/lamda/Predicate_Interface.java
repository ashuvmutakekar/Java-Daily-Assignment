package lamda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predicate_Interface {
     public static void main(String[] args) {
    	 //R-boolean tsest(T t)
    	 Predicate<String> fun=(str)->7==str.length();
    	 if(fun.test("Nitha"))
    	 {
    		 System.out.println("Correct");
    	 }
    	 else
    	 {
    		 System.out.println("Incorrect");
    	 }
     }
}
