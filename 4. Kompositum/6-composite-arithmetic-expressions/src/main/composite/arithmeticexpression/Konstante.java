package main.composite.arithmeticexpression;

public class Konstante implements Expression{

	long var1;
	
	public Konstante(long var1) {
		this.var1 = var1;
	}

	public long evaluate() {
		// TODO Auto-generated method stub
		return var1;
	}

}
