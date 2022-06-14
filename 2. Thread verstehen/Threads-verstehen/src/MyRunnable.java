
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("MyRunnable ist gestartet und zählt nun bis 5");
		for(int i=0;i<=5;i++) {
			System.out.println("MyRunnable: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("MyRunnable ist beendet");
	}

}
