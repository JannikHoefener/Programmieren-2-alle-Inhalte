
public class Katze extends Haustier{

	public Katze(String name, int alter) {
		super(name, alter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void zeigen() {
		// TODO Auto-generated method stub
		System.out.println("Ich bin eine " + alter + "Katze und heiﬂe " + name + ".");

	}

	@Override
	public void ger‰uscheMachen() {
		// TODO Auto-generated method stub
		System.out.println("Miau Miau");
	}

}
