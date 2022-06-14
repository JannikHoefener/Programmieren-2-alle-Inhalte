package main.observer.sequential;

public class aktienKurse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Observee & Oberserver anlegen
		ConcreteObservee börse = new ConcreteObservee();
		ConcreteObserver beobachter = new ConcreteObserver();
		
		// Observee & Oberserver verknüpfen
		börse.register(beobachter);
		beobachter.setObservee(börse);
		
		börse.changeState(-5);
		börse.changeState(3);
		börse.changeState(4);
		börse.changeState(7);


	}

}
