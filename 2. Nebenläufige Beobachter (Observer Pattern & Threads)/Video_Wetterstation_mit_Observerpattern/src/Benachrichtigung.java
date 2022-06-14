
public class Benachrichtigung implements Beobachter {

	// Attribute
	private Subject subject;

	// Konstruktor
	public Benachrichtigung(Subject subject) {
		this.subject = subject;
	}

	// Methoden
	public void setzteTemperatur(double temp) {
		System.out.println("Benachrichtigung �ber " + temp + " Grad verschickt!");
	}

	@Override
	public void aktualisiere() {
		// Das Subject nach der aktuellen Temperatur fragen
		// subject einer Wetterstation casten und diese der Methode setzteTemperatur �bergeben
		this.setzteTemperatur(((Wetterstation) subject).getTemperatur());
	}

}
