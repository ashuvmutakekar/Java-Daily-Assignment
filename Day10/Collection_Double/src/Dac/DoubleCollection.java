package Dac;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleCollection {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	ArrayList<Double> DoubleList = new ArrayList<Double> ();
    	String str="Y";
     do {
	
	        System.out.println("Enter Number");
	         double d=sc.nextDouble();
	         DoubleList.add(d);
	         sc.nextLine();
	         System.out.println("If you want to enter Y/N");
	         
	         str=sc.nextLine();  
	
       } while(str.equals("Y"));
     
      double sum=0;
       for(int i=0;i<DoubleList.size();i++)
       {
    	   
    	   double x=DoubleList.get(i);
    	  sum=sum+x;
       }
       System.out.println("Addition :" +sum);
    }
}
