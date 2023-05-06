
public class GreetingRunnable implements Runnable {
	
	private String greeting;
	
	public GreetingRunnable(String agreeting) {
		greeting = agreeting;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(new java.util.Date() + " " + greeting);
	}
	
	
}
