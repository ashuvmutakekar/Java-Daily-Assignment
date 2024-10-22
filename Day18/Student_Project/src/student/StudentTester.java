package student;

public class StudentTester {

	public static void main(String[] args) {
		Student s1=new Student(12,"Akshay","Cdac");
		Student s2=new Student(13,"Ashwini","Acts");
		Student s3;
		s3=s2;
		s1=null;
		System.out.println("1st GC");
		
	
	
		s2=null;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("2nd GC");
		
		s3=null;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("3rd GC");
		
	}

}
