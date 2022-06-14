package withMain;

public abstract class Fisch {
	
	// Attribute
	String art;
	
	// Konstruktor
	public Fisch(String art) {
		this.art = art;
	}
	
	// Methoden
	public abstract void rumSchwimmen();
	
	public abstract void blubbern();

}
