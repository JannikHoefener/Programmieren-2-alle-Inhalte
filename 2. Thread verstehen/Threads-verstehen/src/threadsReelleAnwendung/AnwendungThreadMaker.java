package threadsReelleAnwendung;

import java.util.ArrayList;
import java.util.List;

public class AnwendungThreadMaker {

	public static void main(String[] args) {

		List<Hund> hundeListe = new ArrayList<>();
		System.out.println("Unser Tierheim hat viele Hunde");
		
		// Auf basis von dem Runnable wird ein neuer Thread erstellt, welcher diese Methode im Hintergrund ausführt 
		ThreadMaker.lassImHintergrundLaufen(new Runnable() {
			// Eine Anonyme-Klasse (lambda möglich, da quasi eine "Wegwerf-Funktion")
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					// Erstellt mit For-Schleife immer ein neues Objekt
					Hund hund = new Hund("Doggo " + i);
					// Fügt Objekt im jeden Durchlauf zur Liste hinzu
					hundeListe.add(hund);
				}
				
			}
		});
		
		// ---------------------
		
		System.out.println("Das sind unsere Hunde: ");
		for (Hund hund : hundeListe) {
			System.out.println(hund.getName());
		}
		// Ohne .join(); würden die 1000 Hunde nicht ausgegeben werden dann wir hier ankommen bevor der Thread durch ist
		
		System.out.println("Ende des Programms!");
	}

}
