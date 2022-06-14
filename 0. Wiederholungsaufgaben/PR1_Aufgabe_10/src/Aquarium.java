import java.util.ArrayList;

public class Aquarium {

	// Attribute und Liste
	int volumen;
	static ArrayList<Fisch> fische = new ArrayList<Fisch>();
	
	// Konstruktor
	public Aquarium(int volumen) {
		this.volumen = volumen;
	}
	
	// Methoden 
	public static void reinsetzten(Fisch fisch) {
		fische.add(fisch);
	}
	
	public static void alleSchwimmen() {
		for(Fisch f : fische){
			f.rumSchwimmen();
			}
	}
	
	public static void alleBlubbern() {
		for(Fisch f : fische){
			f.blubbern();
			}
	}
	
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

		

	}

}
