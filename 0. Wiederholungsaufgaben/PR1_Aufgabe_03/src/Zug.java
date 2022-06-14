import java.util.ArrayList;

public class Zug extends Lokomotive{ 
	
	//Zug = Personenzug = Lokomotive + Personenwagen
	Lokomotive Lok1 = new Lokomotive(1000);
	
	ArrayList<Personenwagen> PersonenwagenListe = new ArrayList<Personenwagen>();
 
	// Beim Konstruktor ist eine Lokomotive anzugeben
//	public Zug(Lokomotive lok) {
//	}
	
	public Zug(int ps) {
		super(ps);
		// TODO Auto-generated constructor stub
	}


	// zum Hinzufügen eines Wagens
	public void addWagen(){
		int leistung = Ps / PersonenwagenListe.size();
		if (leistung < 100) {
			System.out.println("Hinzufügen nicht möglich...Überlastet");
		} else {
			PersonenwagenListe.add(null);
		}
	}
	
	// Gesamtzahl der Sitzplätze als Ergebnis zurückliefern
	public int getSitzplaetze() {
//		int sitzplätzeZug = 0;
//		for(int i = 0; i < PersonenwagenListe.size(); i++) {
//			sitzplätzeZug += Sitzplaetze;
//		} 
//		return sitzplätzeZug;
	}
	
	// Gesamtzahl der Plätze
	public void getPlaetze() {
//		return allePlaetzeZug;
	}
	
	// toString
	public String toString() {
		System.out.println("Der Zug hat eine Lokomotive mit: " + Ps + ",");
		System.out.println("der Zug hat ingesamt " + allePlaetzeZug +",");
		System.out.println("davon sind " + sitzplätzeZug + " Sitzplätze");
	}
	
}
