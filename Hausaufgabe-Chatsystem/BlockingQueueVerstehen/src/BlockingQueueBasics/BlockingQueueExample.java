package BlockingQueueBasics;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {

        // BlockingQueue Arten
        BlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(3); // Hat eine Fixe-Größe
        BlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();

        // BlockingQueue erstellen
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue(3);

        // BlockingQueue Elemente hinzufügen (enque)
        blockingQueue.add("Element 1");
        blockingQueue.add("Element 2");

        // BlockingQueue Elemente entnehmen (deque)
        String el1 = blockingQueue.take();
        String el2 = blockingQueue.take();

        System.out.println(el1);
        System.out.println(el2);


    }
}
