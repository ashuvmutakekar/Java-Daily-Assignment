package lamda;

import java.util.function.BiFunction;


public class Functional_Interface {
     public static void main(String[] args) {
    	 //R apply(T t)
    	 BiFunction<Integer,Integer,Integer> fun=(a,b)->a+b;
    	 System.out.println(fun.apply(12,15));
     }
}
