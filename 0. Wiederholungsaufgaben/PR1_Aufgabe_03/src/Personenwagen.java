
public class Personenwagen {
	int Sitzplaetze;
	int Stehplaetze;
	
	public Personenwagen(int sitzplaetze, int stehplaetze) {
		super();
		Sitzplaetze = sitzplaetze;
		Stehplaetze = stehplaetze;
	}

	public int getSitzplaetze() {
		return Sitzplaetze;
	}

	public int getPlaetze() {
		int allePlaetze = Sitzplaetze + Stehplaetze;
		return allePlaetze;
	}
	
}
