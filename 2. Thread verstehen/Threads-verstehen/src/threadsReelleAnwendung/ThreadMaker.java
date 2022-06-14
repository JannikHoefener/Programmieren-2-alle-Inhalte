package threadsReelleAnwendung;

public class ThreadMaker {
	
	public static void lassImHintergrundLaufen(Runnable runnable) {
		// Es muss ein Runnable-Interface �bergeben werden
		
		// Es wird innerhalb der Methode ein neuer Thread gestartet welcher der Abarbeit dient
		// Dieser Thread erh�lt dann das Runnable"Objekt"
		Thread thread = new Thread(runnable);
		thread.start();
		// Hauptprogramm sargen: Warten bis dieser Thread abgeschlossen ist!!!
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
