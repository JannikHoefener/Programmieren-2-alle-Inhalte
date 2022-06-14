package main.observer.sequential;

import java.util.concurrent.TimeUnit;

// import jdk.internal.misc.FileSystemOption;

public class ConcreteObserver implements Observer {

    private int value;
    private ConcreteObservee observee;

    public int getValue() {
        return value;
    }
    public void setObservee(final ConcreteObservee observee) {
        this.observee = observee;
    }

    @Override
    public void update() {
        doSomething();
    }

    private void doSomething() {
    	final var prozent = this.observee.getValue();
        final var waitTime = this.observee.getValue();
        try {
        	System.out.println("Der Aktienkurs hat sich um " + prozent + " verändert");
            TimeUnit.MILLISECONDS.sleep(waitTime);
            this.value = waitTime;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
