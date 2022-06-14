import java.util.Random;
import java.util.Scanner;

public class W�rfel {

	// W�rfel aus Enum erstellen
	enum cube {
		EINS, ZWEI, DREI, VIER, FUENF, SECHS
	}

	// Array mit Enums-Inhalten erstellen
	static cube[] allvaluesArray = cube.values();
	
	
	// Methode zwecks W�rfeln
	static void w�rfeln() {
		//random erstellen
		Random rand = new Random();
		int randomZahl = rand.nextInt(5);
		
		//erster Wurf
		W�rfel.cube wurfZahl = allvaluesArray[randomZahl];
		System.out.println("Mein W�rfel zeigt: " + wurfZahl);
		
		//weiter werfen?
		System.out.println("M�chten Sie nochmal w�rfeln? (j/n)");
		Scanner scan = new Scanner(System.in);
		String eingabe = scan.next();
		
		if (eingabe.equals("j")) {
			w�rfeln();
		} else {
			scan.close();
		}
	}

	public static void main(String[] args) {
		
		// Methode w�rfel (random + erneutes w�hlen?)
		w�rfeln();

		// Array ausgeben
//		for (cube value : allvaluesArray) {
//			System.out.println(value);
//		}
		
		// Random testen
//		System.out.println(randomZahl);

	}

}
