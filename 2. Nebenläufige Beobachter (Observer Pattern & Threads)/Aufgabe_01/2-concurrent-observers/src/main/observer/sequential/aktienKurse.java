package main.observer.sequential;

public class aktienKurse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Observee & Oberserver anlegen
		ConcreteObservee b�rse = new ConcreteObservee();
		ConcreteObserver beobachter = new ConcreteObserver();
		
		// Observee & Oberserver verkn�pfen
		b�rse.register(beobachter);
		beobachter.setObservee(b�rse);
		
		b�rse.changeState(-5);
		b�rse.changeState(3);
		b�rse.changeState(4);
		b�rse.changeState(7);


	}

}
