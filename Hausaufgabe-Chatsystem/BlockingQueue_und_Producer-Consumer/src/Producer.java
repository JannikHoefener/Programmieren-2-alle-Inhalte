import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {
    private BlockingQueue<Integer> blockingQueue;
    private int sleepTime;

    public Producer(BlockingQueue<Integer> blockingQueue, String name, int sleepTime) {
        this.blockingQueue = blockingQueue;
        this.setName(name);
        this.sleepTime = sleepTime;
    }

    public void run() {
        for (; ; ) {
            try {
                blockingQueue.put(1); // auffüllen um 1
                System.out.println("filled 1, size = " + blockingQueue.size());
                TimeUnit.MILLISECONDS.sleep((int) (Math.random() * sleepTime));
            } catch (InterruptedException ex) {
                System.out.println(ex);
                interrupt();
                System.out.println(this.getName() + " end");
                break;
            }
        }
    }
}
