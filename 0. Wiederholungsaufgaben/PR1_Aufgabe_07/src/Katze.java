
public class Katze extends Haustier{

	public Katze(String name, int alter) {
		super(name, alter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void zeigen() {
		// TODO Auto-generated method stub
		System.out.println("Ich bin eine " + alter + "Katze und heiße " + name + ".");

	}

	@Override
	public void geräuscheMachen() {
		// TODO Auto-generated method stub
		System.out.println("Miau Miau");
	}

}
