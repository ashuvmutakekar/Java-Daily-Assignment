package Acts;

import java.util.Objects;

@SuppressWarnings("rawtypes")
public class StudentKey implements Comparable{
	final	String  div;
	final	String std;
	final	Integer rollno;
	public StudentKey(String std, String div, Integer rollno) {
		super();
		this.div = div;
		this.std = std;
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "StudentKey [div=" + div + ", std=" + std + ", rollno=" + rollno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(div, rollno, std);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentKey other = (StudentKey) obj;
		return Objects.equals(div, other.div) && Objects.equals(rollno, other.rollno) && Objects.equals(std, other.std);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
