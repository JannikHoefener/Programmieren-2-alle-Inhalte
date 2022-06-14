
public class Anzeige implements Beobachter{
	
	// Attribute
	private Subject subject;
	
	// Konstruktor
	public Anzeige (Subject subject) {
		this.subject = subject;
	}
	
	// Methoden 
	public void setzteTemperatur(double temp) {
		System.out.println("Anzeige zeigt nun " + temp + " Grad an.");
	}

	@Override
	public void aktualisiere() {
		// Das Subject nach der aktuellen Temperatur fragen
		// subject einer Wetterstation casten und diese der Methode setzteTemperatur übergeben
		this.setzteTemperatur(((Wetterstation) subject).getTemperatur());
	}

}
