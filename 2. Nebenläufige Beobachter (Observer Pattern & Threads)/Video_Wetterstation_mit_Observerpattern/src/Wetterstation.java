import java.util.ArrayList;

public class Wetterstation implements Subject{
	
	// Grundlegendes
	ArrayList<Beobachter> beobachterListe = new ArrayList<Beobachter>();
	
	public double temperatur = 20.0;
	public double getTemperatur() {
		return temperatur;
	}
	

	
	// Methoden für Beobachter
	public void benachrichtigenAlleBeobachter() {
//		double temp = getTemperatur(); // temp = temperatur
//		thermometer.setzteTemperatur(temp);
//		anzeige.setzteTemperatur(temp);
//		benachrichtigung.setzteTemperatur(temp);
		
		// Neuer Code ... durch die beobachterListe iterieren und die Funkt. aktualisieren aufrufen
		for (Beobachter beobachter : beobachterListe) {
			beobachter.aktualisiere();
		}
	}

	@Override
	public void registriereBeobachter(Beobachter beobachter) {
		// Beobachter zur ArrayList beobachterListe hinzufügen
		beobachterListe.add(beobachter);
	}

	@Override
	public void deregistriereBeobachter(Beobachter beobachter) {
		// Beobachter aus der ArrayList beobachterListe entfernen	
		beobachterListe.remove(beobachter);
	}

}
