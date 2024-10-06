package Acts;

import java.util.Comparator;

public class compareBalance implements Comparator <Account> {
	
	@Override
	public int compare(Account a1,Account a2){
		return a2.getBalance().compareTo(a1.getBalance());
	}
	

}
