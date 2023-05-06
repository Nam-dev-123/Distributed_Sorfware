import java.util.Date;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now + " " + " Hello, World!");
	}

}

/*
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(new java.util.Date() + " " + " Hello, World!");
	}

}

 */