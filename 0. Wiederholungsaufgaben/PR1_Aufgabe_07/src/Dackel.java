
public class Dackel extends Haustier{

	public Dackel(String name, int alter) {
		super(name, alter);
		// TODO Auto-generated constructor stub
	}

	public void zeigen() {
		// TODO Auto-generated method stub
		System.out.println("Ich bin ein " + alter + "Dackel und heiße " + name + ".");
	}

	@Override
	public void geräuscheMachen() {
		// TODO Auto-generated method stub
		System.out.println("Wau Wau");
		
	}

}
