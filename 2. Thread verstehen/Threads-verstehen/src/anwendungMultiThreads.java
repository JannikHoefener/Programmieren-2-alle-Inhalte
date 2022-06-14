
public class anwendungMultiThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Erstellung per extends Thread
		MyThread thread1Thread = new MyThread();
		
		// Erstellung per implements Runnable
		MyRunnable runnable = new MyRunnable();
		Thread thread2Runnable = new Thread(runnable);
		
		thread1Thread.start();
		thread2Runnable.start();

	}

}
