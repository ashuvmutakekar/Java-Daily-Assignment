package student;

public class StudentTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(12,"Akshay","Cdac");
		
		System.out.println(s1);
	
		
		Student s2=s1.clone();
		System.out.println(s2);
		System.out.println("Student 1 and Student 2 "+ (s2==s1));
		s2.setRollno(13);
		s2.setName("Ashwini");
		s2.setDept("IT");
		System.out.println(s2);
		
	}

}
