package Acts;

import java.util.Comparator;

public class CampareName implements Comparator <Account> {
	
	@Override
	public int compare(Account a1,Account a2){
		return a1.getName().compareTo(a2.getName());
	}
	

}
