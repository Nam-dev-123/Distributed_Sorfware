package Thread;

public class Main {
	public static void main(String[] args) {
		// try {
			
		// 	for	(int i=0; i<10; i++) {
		// 		GreetingRunnable r1 = new GreetingRunnable("Hello");
		// 		GreetingRunnable r2 = new GreetingRunnable("Goodbye");
		// 		Thread t1 = new Thread(r1);
		// 		Thread t2 = new Thread(r2);
		// 		t1.start();
		// 		t2.start();
		// 		Thread.sleep(1000);
		// 	}
			
		// } catch (Exception e) {
		// 	// TODO: handle exception
		// }
			Runnable r = new MyRunnable();
			Thread t = new Thread(r);
			t.start();
			t.interrupt();
	}
}
