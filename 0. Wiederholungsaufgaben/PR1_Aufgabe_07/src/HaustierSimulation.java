import java.util.ArrayList;

public class HaustierSimulation {

	ArrayList<Haustier> haustierListe = new ArrayList<Haustier>();

	// Haustier zur Liste hinzufügen
	public void hinzufügen(Haustier newHaustierObj) {
		haustierListe.add(newHaustierObj);
	}

	// Haustier finden (return)
	public Haustier finden(Haustier name) {
		if (haustierListe.contains(name)){
			return name;
		} else {
			return null;
		}
	}
	
	// Haustier ausgeben (Print)
	public void einTierZeigen(Haustier name) {
		if (haustierListe.contains(name)){
			System.out.println("Tier mit dem namen: "+ name + " gefunden");
		} else {
			System.out.println("Kein Tier mit dem Namen gefunden");
		}
	}
	
	//Alle Haustiere in der Liste zeigen
	public void alleTiereZeigen() {
		for(Haustier t : haustierListe){
			t.zeigen();
			}
	}

}
