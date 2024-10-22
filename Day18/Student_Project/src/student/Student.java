package student;

public class Student {
 Integer rollno;
 String name;
 String Dept;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Integer rollno, String name, String dept) {
	super();
	this.rollno = rollno;
	this.name = name;
	Dept = dept;
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
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", Dept=" + Dept + "]";
}
 
}
