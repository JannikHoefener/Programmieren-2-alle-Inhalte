
public class Client {

	public static void main(String[] args) {
		
		// Objekte erstellen
		
		// Subject
		Wetterstation wetterstationHamburg = new Wetterstation();
		// Beobachter => Generalisieren mit dem Supertyp
		Beobachter thermometer = new Thermometer(wetterstationHamburg);
		Beobachter anzeige = new Anzeige(wetterstationHamburg);
		Beobachter benachrichtigung = new Benachrichtigung(wetterstationHamburg);
		
		// Beobachter beim Subject registrieren
		wetterstationHamburg.registriereBeobachter(thermometer);
		wetterstationHamburg.registriereBeobachter(anzeige);
		wetterstationHamburg.registriereBeobachter(benachrichtigung);
		
		
	//===> Programm Ablauf
		
		// aktuelle Temperatur ausgeben
		wetterstationHamburg.benachrichtigenAlleBeobachter();
		
		// Temperatur ändert sich 
		wetterstationHamburg.temperatur = 29.5;
		
	//===> Vorteil: Dynamische abmeldung eines Beobachter
		
		// Deregistrierung eines Beobachters
		wetterstationHamburg.deregistriereBeobachter(benachrichtigung);
		
		// aktualisierte Temperatur ausgeben
		wetterstationHamburg.benachrichtigenAlleBeobachter();

		

	}

}
