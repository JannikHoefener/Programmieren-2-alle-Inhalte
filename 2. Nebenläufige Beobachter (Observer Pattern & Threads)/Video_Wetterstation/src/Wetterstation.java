
public class Wetterstation {
	
	public double temperatur = 20.0;
	
	// Getter für die Temperatur
	public double getTemperatur() {
		return temperatur;
	}
	
	// Objekte (Beobachter anlegen)
	Thermometer thermometer = new Thermometer();
	Anzeige anzeige = new Anzeige();
	Benachrichtigung benachrichtigung = new Benachrichtigung();
	
	// Methode - alle Beobachter benachrichtigen
	public void benachrichtigenAlleBeobachter() {
		double temp = getTemperatur(); // temp = temperatur
		thermometer.setzteTemperatur(temp);
		anzeige.setzteTemperatur(temp);
		benachrichtigung.setzteTemperatur(temp);
	}

}
