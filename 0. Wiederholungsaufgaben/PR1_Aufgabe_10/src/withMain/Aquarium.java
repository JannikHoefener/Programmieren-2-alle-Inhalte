package withMain;
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
	
}
