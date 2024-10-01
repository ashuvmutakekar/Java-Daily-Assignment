package acts;
import acts.Shape;
public class Circle extends Shape{
  int radius;
  private final double pi=3.142;
  public Circle() {
	  
  }
  public Circle(int radius) {
	  super();
	  this.radius=radius;
  }
  final void draw()
  {
	 System.out.println("Draw Circle");  
  }
  @Override
  public double calArea()
  { 
	   return pi*radius*radius;
	  
  }

  @Override
  public double calPerimeter()
  { 
	  return 2*pi*radius;
	  
  }
}
