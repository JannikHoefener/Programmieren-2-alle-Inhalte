
public class Motorrad {

	// Variabeln
	String typ = "X";
	String farbe = "X";
	int hubraum = 0;
	
	// Konstruktor
	public Motorrad() {
		
	}
	
	public Motorrad(String typ, String farbe, int hubraum) {
		super();
		this.typ = typ;
		this.farbe = farbe;
		this.hubraum = hubraum;
	}
	
	// Methoden
	public static void schreibeInfos(Motorrad name) {
		if(name.typ.equals("Sportler") || name.typ.equals("Chopper") || name.typ.equals("Cruiser") || name.typ.equals("Enduro")) {
			System.out.println("Typ: " + name.typ);
		} else {
			System.out.println("nicht vergeben oder vorhanden");
		}
		
		if(name.farbe.equals("schwarz") || name.farbe.equals("rot") || name.farbe.equals("blau") || name.farbe.equals("silber")) {
			System.out.println("Farbe: "+ name.farbe);
		} else {
			System.out.println("nicht vergeben oder vorhanden");
		}
		
		if(name.hubraum ==  0) {
			System.out.println("kein Hubraum angeben");
		} else if (name.hubraum < 125 || name.hubraum > 1300) {
			System.out.println(name.hubraum + " liegt nicht im Möglichenbereich, bitte korregieren");
		} else {
			System.out.println("Hubraum: " + name.hubraum);
		}
	}
	
	public static double berechneSteuern(Motorrad name) {
		double steuern = 0;
		if(name.hubraum ==  0) {
			System.out.println("kein Hubraum angeben");
		} else if (name.hubraum < 125 || name.hubraum > 1300) {
			System.out.println(name.hubraum + " ungültiger Hubraumwert");
		} else {
			steuern = (name.hubraum / 25) * 1.84;
		}
		return steuern;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorrad Mo1 = new Motorrad("Sportler", "Grün", 124);
		schreibeInfos(Mo1);
		System.out.println(berechneSteuern(Mo1));
		
		Motorrad Mo2 = new Motorrad("Dies und das","schwarz",1200);
		schreibeInfos(Mo2);
		System.out.println(berechneSteuern(Mo2));

	}

}
