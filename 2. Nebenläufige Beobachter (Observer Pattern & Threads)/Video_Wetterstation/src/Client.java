
public class Client {
	// Programm Ausf�hrung
	public static void main(String[] args) {
		
		// Wetterstation Objekt erstellen
		Wetterstation wetterstationHamburg = new Wetterstation();
		
		// aktuelle Temperatur ausgeben
		wetterstationHamburg.benachrichtigenAlleBeobachter();
		
		// Temperatur �ndert sich 
		wetterstationHamburg.temperatur = 29.5;
		
		// aktualisierte Temperatur ausgeben
		wetterstationHamburg.benachrichtigenAlleBeobachter();

		

	}

}
