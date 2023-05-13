package Thread;
/*
import java.util.Date;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now + " " + " Hello, World!");
	}

}
*/
/*
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(new java.util.Date() + " " + " Hello, World!");
	}

}

 */

 public class MyRunnable implements Runnable {
	 
	@Override
	public void run() {
		try {
			System.out.println(1);
			Thread.sleep(1000);
			System.out.println(2);
				
		} catch (InterruptedException exception) {
			// TODO: handle exception
			System.out.println(3);
		}
		System.out.println(4);
	}
 }
