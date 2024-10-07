package JobTester;

import java.time.LocalDate;

import jobPortal.JobSeeker;
import java.util.List;
public class Validation {
	public static LocalDate validateDob(LocalDate strDate) {
		
		LocalDate today = LocalDate.now();
		if(strDate.isBefore(today)) {
			return strDate;
		}
		return null;
	}
	public static LocalDate validateDoG(LocalDate strDate) {
		
		LocalDate today = LocalDate.now();
		if(strDate.isBefore(today)) {
			return strDate;
		}
		return null;
	}
	public static JobSeeker validateDuplication(JobSeeker js,List<JobSeeker> jsList) {
		int count=0;
		for(int i=0;i<jsList.size();i++) {
			if(jsList.contains(js)){
				count++;
			}
		}
		if (count<=1) {
		
		return js;
		}
		return null;
	}
	
	public static String validatePhoneNo(String phnNo) {
		if(phnNo.length() != 10) {
			System.out.println("Number is Invalid.");
		}
		int count=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(phnNo.charAt(i)==j) {
					count++;
				}
			}
		}
			if(count<10) {
				System.out.println("Invalid Number");
			}
		
		return phnNo;
		
	}
}
