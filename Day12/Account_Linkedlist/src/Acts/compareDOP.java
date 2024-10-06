package Acts;

import java.util.Comparator;

public class compareDOP implements Comparator <Account> {
	
	@Override
	public int compare(Account a1,Account a2){
		return a1.getDop().compareTo(a2.getDop());
	}
	

}