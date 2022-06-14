import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
    private BlockingQueue<Integer> blockingQueue;
    private int sleepTime;

    public Consumer(BlockingQueue<Integer> blockingQueue, String name, int sleepTime) {
        this.blockingQueue = blockingQueue;
        this.setName(name);
        this.sleepTime = sleepTime;
    }

    public void run() {
        int value = 0;
        for (; ; ) {
            try {
                value = blockingQueue.take(); // abholen
                System.out.println("removed 1, size = " + blockingQueue.size());
                TimeUnit.MILLISECONDS.sleep((int) (Math.random() * sleepTime));
            } catch (InterruptedException ex) {
                System.out.println(ex);
                interrupt();
                System.out.println(Thread.currentThread().getName() + " end");
                break;
            }
        }
    }
}