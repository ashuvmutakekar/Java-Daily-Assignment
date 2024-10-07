package accountV3;

import java.time.LocalDate;

public class Validation {
	public static LocalDate validateDob(String strDate) {
		LocalDate dofo=LocalDate.parse(strDate);
		LocalDate today = LocalDate.now();
		if(dofo.isBefore(today)) {
			return dofo;
		}
		return null;
	}
	 public static Double validateBalance(Double bal) {
		 
		 if(bal>1000) {
			 return bal;
		 }
		return null;
		 
	 }
}
