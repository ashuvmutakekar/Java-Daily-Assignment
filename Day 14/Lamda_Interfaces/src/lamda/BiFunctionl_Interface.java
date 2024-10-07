package lamda;

import java.util.function.Function;

public class BiFunctionl_Interface {
     public static void main(String[] args) {
    	 //R apply(T t,T t1s)
    	 Function<String ,Integer> fun=(str)->Integer.parseInt(str);
    	 System.out.println(fun.apply("12"));
     }
}
