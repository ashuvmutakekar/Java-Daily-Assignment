package acts;
import acts.Shape;
import java.util.Scanner;

public class ShapeTest {
  public static void main( String[] args) {
    Shape s=null;
    Scanner sc=new Scanner(System.in);
    int ch;
    do{
     System.out.println(" 1.Circle");
     System.out.println(" 2.Rectangle");
     System.out.println(" 3.cal Circle using downcasting");
     System.out.println(" 4. Exit");
     
     System.out.println("Enter choice :");
     ch=sc.nextInt();
     switch(ch) {
     case 1:{
    	       System.out.println("Enter details abourt Circle:");
    	       System.out.println("Enter Radius:");
    	       int r=sc.nextInt();
    	       s=new Circle(r);
    	       int h;
    	       do
    	       {
    	       System.out.println(" 3 Perimeter");
    	       System.out.println(" 4 Area");
    	       
    	       System.out.println("Enter choice :");
    	       h=sc.nextInt();
    	       switch(h)
    	       {
    	       case 3:System.out.println("Perimeter of Circle :" +s.calPerimeter());
    	              break;
    	       case 4:System.out.println("Area of Circle :" +s.calArea());
	              break;
    	       }
    	       
            }while(h<4);
    	  }
            break; 
       
     case 2:{
	       System.out.println("Enter details about Rectangle:");
	       System.out.println("Enter length:");
	       int l=sc.nextInt();
	       System.out.println("Enter breth:");
	       int b=sc.nextInt();
	       s=new Rectangle(l,b);
	       int h;
	       do
	       {
	       System.out.println(" 3 Perimeter");
	       System.out.println(" 4 Area");
	       
	       System.out.println("Enter choice :");
	       h=sc.nextInt();
	       switch(h)
	       {
	       case 3:System.out.println("Perimeter of Circle :" +s.calPerimeter());
	              break;
	       case 4:System.out.println("Area of Circle :" +s.calArea());
            break;
	       }
	       
      }while(h<4);
	  }
      break;
     case 3: {
    		   s=new Circle();
    		   if(s instanceof Circle)
    		   {
    			   Circle c=(Circle) s;
    			   System.out.println("Upcasting done");
    			   c.draw();
    		   }
    		   
    		 
    		 
    	 }break;
     case 4:break;
     }
    }while(ch<4);
  }
}
 
