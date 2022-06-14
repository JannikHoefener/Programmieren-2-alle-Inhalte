package main.composite.arithmeticexpression;

import java.util.ArrayList;
import java.util.List;

public class Operator implements Expression{

	long var1;
	long var2;
	
	List<Operator> ArithListOpInOp = new ArrayList<Operator>(2);
	
	// Konstruktor
	public Operator(long var1, long var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public Operator(Operator1, Operator2) {
		this.var1 = var1;
		this.var2 = var2;
	}

	// Methoden
	@Override
	public long evaluate() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public long add() {
		return var1 + var2;
	};
	
	public long sub() {
		return var1 - var2;
	};
	
	public long mult() {
		return var1 * var2;
	};
	
	public long div() {
		return var1 / var2;
	};
	
	

}
