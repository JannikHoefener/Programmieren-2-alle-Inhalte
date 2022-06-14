
public interface Subject {
	
	public void benachrichtigenAlleBeobachter();
	
	public void registriereBeobachter(Beobachter beobachter);
	public void deregistriereBeobachter(Beobachter beobachter);
	
}
