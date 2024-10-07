package lamda;

import java.util.function.DoublePredicate;

public class DoublePredicate_Interface {
     public static void main(String[] args) {
    	 //R-boolean tsest(Double t)
    	 DoublePredicate fun=(d)->12.25==d;
    	 if(fun.test(12.25))
    	 {
    		 System.out.println("Correct");
    	 }
    	 else
    	 {
    		 System.out.println("Incorrect");
    	 }
     }
}
