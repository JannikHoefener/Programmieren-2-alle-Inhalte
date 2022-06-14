
abstract public class Haustier {
	// Attribute
	String name;
	int alter;
	
	// Konstruktor
	public Haustier(String name, int alter) {
		super();
		this.name = name;
		this.alter = alter;
	}

	// Methoden
	public String getName() {
		return name;
	}

	public int getAlter() {
		return alter;
	}
	
	public abstract void zeigen();
	
	public abstract void geräuscheMachen();

	
	
	
	
}
