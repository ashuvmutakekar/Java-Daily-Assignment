package Acts;

import java.time.LocalDate;

public class ValidateFields {
    public static LocalDate validateDop(String str) {
    	LocalDate dop=LocalDate.parse(str);
    	LocalDate today=LocalDate.now();
    	if(today.isAfter(dop)) {
    		return dop;
    	}
    	else
    	{
    		return null;
    	}   }
    public static double validateBalance(double d) {
    	if(d>1000)
    	{
    		return d;
    	}
    	else{
    		
    	return 0;
    	}
    }
}
