package Acts;

import java.util.Objects;

public class Student {
   String key;
   Integer rollno;
   String name;
   String std;
   String div;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String key, Integer rollno, String name, String std, String div) {
	super();
	this.key = key;
	this.rollno = rollno;
	this.name = name;
	this.std = std;
	this.div = div;
}
public String getKey() {
	return key;
}
public void setKey(String key) {
	this.key = key;
}
public Integer getRollno() {
	return rollno;
}
public void setRollno(Integer rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStd() {
	return std;
}
public void setStd(String std) {
	this.std = std;
}
public String getDiv() {
	return div;
}
public void setDiv(String div) {
	this.div = div;
}
@Override
public int hashCode() {
	return Objects.hash(div, key, name, rollno, std);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(div, other.div) && Objects.equals(key, other.key) && Objects.equals(name, other.name)
			&& Objects.equals(rollno, other.rollno) && Objects.equals(std, other.std);
}
@Override
public String toString() {
	return "Student [key=" + key + ", rollno=" + rollno + ", name=" + name + ", std=" + std + ", div=" + div + "]";
}
   
}
