package sum;

public class sum1Threads extends Thread {

	public sum1Threads() {
		super();
		// TODO Auto-generated constructor stub
	}
	 @Override
	    public void run() {
	        int sum = 0;
	        for (int i = 1; i <= 100; i++) {
	            sum += i;
	        }
	        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
	    }
     
}
