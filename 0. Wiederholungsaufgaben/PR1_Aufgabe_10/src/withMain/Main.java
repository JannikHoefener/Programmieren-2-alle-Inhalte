package withMain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Anwendung:
		
		// Fische erstellen
		Fisch fisch1 = new Guppy("GuppyA");
		Fisch fisch2 = new Guppy("GuppyB");
		Fisch fisch3 = new Goldfisch("GoldfischA");
		Fisch fisch4 = new Goldfisch("GoldfischB");
		
		// Fische zur Liste hinzufügen
		reinsetzten(fisch1);
		reinsetzten(fisch2);
		reinsetzten(fisch3);
		reinsetzten(fisch4);
		
		// Fische schwimmen lassen
		alleSchwimmen();
		
		// Fische blubbern lassen
		alleBlubbern();

		//???// wieso klappt es nicht und wieso muss eig static sein (bei nicht mit main klasse)
		

	}


}
