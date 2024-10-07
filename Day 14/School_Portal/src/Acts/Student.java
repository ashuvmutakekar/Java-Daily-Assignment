package Acts;

import java.util.Objects;

public class Student {
   StudentKey key;
   String name;
   
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String div,String std,Integer rollno,  String name) {
	super();
	this.key = new StudentKey(div,std,rollno);
	
	this.name = name;
	
}
public StudentKey getKey() {
	return key;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [key=" + key + ", name=" + name + "]";
}




   
}
