package dac;

import java.util.Comparator;

public class compareGod implements Comparator <JobSeeker> {
	
	@Override
	public int compare(JobSeeker a1,JobSeeker a2){
		return a1.getGraduationDate().compareTo(a2.getGraduationDate());
	}
	

}
