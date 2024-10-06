package Acts;

import java.util.Comparator;

public class CompareAccno implements Comparator <Account> {
	
	@Override
	public int compare(Account a1,Account a2){
		return a2.getAccno().compareTo(a1.getAccno());
	}
	


}
