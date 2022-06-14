
public class Event {
	String eventname;
	String datum;
	String uhrzeit;
	enum Prio {hoch, mittel, niedrig};
	Prio prio;
	enum Typ {Uni, Sport, Freunde, Familie, sonstiges};
	Typ typ = "sonstiges";

	
	//// Konstruktor
	public Event(String eventname, String datum, String uhrzeit) {
		super();
		this.eventname = eventname;
		this.datum = datum;
		this.uhrzeit = uhrzeit;
	}

	public Event(String eventname, String datum, String uhrzeit, String typ) {
		super();
		this.eventname = eventname;
		this.datum = datum;
		this.uhrzeit = uhrzeit;
		this.typ = typ;
	}

	//// Methoden
	// Getter 
	public String getEventname() {
		return eventname;
	}
	public String getDatum() {
		return datum;
	}
	public String getUhrzeit() {
		return uhrzeit;
	}
	public String getPrio() {
		return prio;
	}
	public String getTyp() {
		return typ;
	}
	
	// Setter
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public void setUhrzeit(String uhrzeit) {
		this.uhrzeit = uhrzeit;
	}
	public void setPrio(String prio) {
		this.prio = prio;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}

	// toString
	@Override
	public String toString() {
		return "Event [Eventname=" + eventname + ", Datum=" + datum + ", Uhrzeit=" + uhrzeit + ", Prio=" + prio
				+ ", Typ=" + typ + "]";
	}

	
}
