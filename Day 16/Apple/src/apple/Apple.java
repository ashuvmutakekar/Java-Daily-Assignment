package apple;

public class Apple {
	
String color;
String taste;
Integer weight;


public Apple() {
	super();
}

public Apple(String color, String taste, Integer weight) {
	super();
	this.color = color;
	this.taste = taste;
	this.weight = weight;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getTaste() {
	return taste;
}

public void setTaste(String taste) {
	this.taste = taste;
}

public Integer getWeight() {
	return weight;
}

public void setWeight(Integer weight) {
	this.weight = weight;
}

@Override
public String toString() {
	return "Apple [color=" + color + ", taste=" + taste + ", weight=" + weight + "]";
}


}
