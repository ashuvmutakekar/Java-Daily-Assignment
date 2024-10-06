package dac;

import java.util.Comparator;

public class compareDob implements Comparator <JobSeeker> {
	
	@Override
	public int compare(JobSeeker a1,JobSeeker a2){
		return a1.getDateOfBirth().compareTo(a2.getDateOfBirth());
	}
	

}
