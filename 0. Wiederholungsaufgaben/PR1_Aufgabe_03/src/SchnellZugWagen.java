
public class SchnellZugWagen extends Personenwagen{
	// Felder des Personenwagens + 1. Klasse 

	int SitzplaetzeFirstClass;

	
	public SchnellZugWagen(int sitzplaetze, int stehplaetze, int SitzplaetzeFirstClass) {
		super(sitzplaetze, stehplaetze);
		// TODO Auto-generated constructor stub
		this.SitzplaetzeFirstClass = SitzplaetzeFirstClass;
	}
	
	public int getSitzpl�tze() {
		return super.getSitzplaetze() + SitzplaetzeFirstClass;
	}
	
	public int getPl�tze() {
		return super.getPlaetze() + super.getSitzplaetze() + SitzplaetzeFirstClass;
	}
	
}
