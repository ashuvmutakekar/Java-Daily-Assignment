package dac;

public class Fruit {
	

	String name;
	String color;
	double price;
    Integer quantity;
public Fruit() {
	name="";
	color="";
	price=0.0;
	quantity=0;
		
	}
	public Fruit(String name, String color, double price, Integer quantity) {
	
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}

	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
