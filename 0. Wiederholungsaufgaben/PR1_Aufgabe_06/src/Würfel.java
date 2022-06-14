import java.util.Random;
import java.util.Scanner;

public class Würfel {

	// Würfel aus Enum erstellen
	enum cube {
		EINS, ZWEI, DREI, VIER, FUENF, SECHS
	}

	// Array mit Enums-Inhalten erstellen
	static cube[] allvaluesArray = cube.values();
	
	
	// Methode zwecks Würfeln
	static void würfeln() {
		//random erstellen
		Random rand = new Random();
		int randomZahl = rand.nextInt(5);
		
		//erster Wurf
		Würfel.cube wurfZahl = allvaluesArray[randomZahl];
		System.out.println("Mein Würfel zeigt: " + wurfZahl);
		
		//weiter werfen?
		System.out.println("Möchten Sie nochmal würfeln? (j/n)");
		Scanner scan = new Scanner(System.in);
		String eingabe = scan.next();
		
		if (eingabe.equals("j")) {
			würfeln();
		} else {
			scan.close();
		}
	}

	public static void main(String[] args) {
		
		// Methode würfel (random + erneutes wählen?)
		würfeln();

		// Array ausgeben
//		for (cube value : allvaluesArray) {
//			System.out.println(value);
//		}
		
		// Random testen
//		System.out.println(randomZahl);

	}

}
