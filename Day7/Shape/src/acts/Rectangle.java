package acts;
import acts.Shape;
public class Rectangle extends Shape{
	int base;
	int hight;
	public Rectangle(int base,int hight){
		super();
		this.base=base;
		this.hight=hight;
	}
   
   @Override
   public double calArea()
   { 
	   return base*hight;
	  
   }
   @Override
   public double calPerimeter()
   { 
	   return 2*(base+hight);
	  
   }
}
