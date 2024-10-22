package sum;

public class ThreadExample {
    public static void main(String[] args) {
    	sum1Threads s=new sum1Threads();
    	Thread t=new Thread(s);
        t.start();
        
      
     

       System.out.println("Thread execution completed.");
    }
}
