package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface {
     public static void main(String[] args) {
    	 
    	
    	 Consumer<List> fun=(list)->System.out.println(list);
    	 List<Double> list=new ArrayList<>();
    	 List<Double> d=new ArrayList<>();
    	 list.add(12.30);
    	 list.add(13.24);
    	 list.add(15.30);
    	 list.add(13.29);
         fun.accept(list);
    	
     }
}
//Interface Consumer
//{
//	Public void Accept(T t);}
//@Override
//accpet(T t)
//{
//	System.out.println(a);}
 //( t)->sop(t);
