package apple;

import java.io.Serializable;

public class Apple implements Serializable {
	private static final long serialVersionUID = 7038317864636135099L;
	String sid;
String color;
String taste;
Integer weight;


public Apple() {
	super();
}



public Apple(String sid, String color, String taste, Integer weight) {
	super();
	this.sid = sid;
	this.color = color;
	this.taste = taste;
	this.weight = weight;
}



public String getColor() {
	return color;
}

public String getSid() {
	return sid;
}



public void setSid(String sid) {
	this.sid = sid;
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
	return "Apple [sid=" + sid + ", color=" + color + ", taste=" + taste + ", weight=" + weight + "]";
}




}
