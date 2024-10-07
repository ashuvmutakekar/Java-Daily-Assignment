package fruit;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>,Comparator<Fruit>{
	String name;
	String color;
	public double price;
	Integer quantity;
	
	
	public Fruit() {
		super();
	}
	
	
	public Fruit(String name, String color, Double price, Integer quantity) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", quantity=" + quantity + "]";
	}


	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		return this.color.compareTo(o.color);
	}


	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.quantity, o2.quantity);
	}
	
	
	public int compare1(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.price, o1.price);
	}

}
