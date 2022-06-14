
public class SchnellZugWagen extends Personenwagen{
	// Felder des Personenwagens + 1. Klasse 

	int SitzplaetzeFirstClass;

	
	public SchnellZugWagen(int sitzplaetze, int stehplaetze, int SitzplaetzeFirstClass) {
		super(sitzplaetze, stehplaetze);
		// TODO Auto-generated constructor stub
		this.SitzplaetzeFirstClass = SitzplaetzeFirstClass;
	}
	
	public int getSitzplätze() {
		return super.getSitzplaetze() + SitzplaetzeFirstClass;
	}
	
	public int getPlätze() {
		return super.getPlaetze() + super.getSitzplaetze() + SitzplaetzeFirstClass;
	}
	
}
