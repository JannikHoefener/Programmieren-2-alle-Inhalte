import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    /*
    Wir legen in main beide Queues an und produzieren verschiedene Abläufe.
    Durch verändern der sleep()-Zeiten kann man verschiedene Aktivitäten nachstellen.
    Kleine Wartezeiten erhöhen die Aktivität von Consumer bzw. Producer.
    */

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(7);
        // 7 ist die obere Grenze
        //LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

        blockingQueue.add(1);
        blockingQueue.add(1);
        blockingQueue.add(1);

        Consumer c1 = new Consumer(blockingQueue, "consumer", 100);
        Producer p1 = new Producer(blockingQueue, "producer", 20);
        Consumer c2 = new Consumer(blockingQueue, "consumer2", 100);
//    Producer p2 = new Producer(lager, "producer2", 50);
        p1.start();
        c1.start();
//    p2.start();
        c2.start();

        try {
            Thread.sleep(1000);
            c1.interrupt();
            p1.interrupt();
            c2.interrupt();
//       p2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}