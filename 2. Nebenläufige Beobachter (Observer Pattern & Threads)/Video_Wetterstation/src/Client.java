
public class Client {
	// Programm Ausführung
	public static void main(String[] args) {
		
		// Wetterstation Objekt erstellen
		Wetterstation wetterstationHamburg = new Wetterstation();
		
		// aktuelle Temperatur ausgeben
		wetterstationHamburg.benachrichtigenAlleBeobachter();
		
		// Temperatur ändert sich 
		wetterstationHamburg.temperatur = 29.5;
		
		// aktualisierte Temperatur ausgeben
		wetterstationHamburg.benachrichtigenAlleBeobachter();

		

	}

}
