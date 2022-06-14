package test.composite.arithmeticexpression;

import org.junit.jupiter.api.Test;

import main.composite.arithmeticexpression.Konstante;
import main.composite.arithmeticexpression.Operator;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ExpressionTests {

	private static final Logger LOGGER = Logger.getLogger(ExpressionTests.class.getName());	
	
	@Test
	void testMult() {
        // Arrange
		Operator op1 = new Operator(2, 9);
		
		//Act
		long expected = op1.mult();
		long actual = 18;
		
		//Assert
		assertEquals(expected, actual); 
	}
	
	@Test
	void testOnly1Konst() {
		Konstante konst1 = new Konstante(5);
		long expected = konst1.evaluate();
		long actual = 5;
		assertEquals(expected, actual);
	}
	
	@Test
	void testOpInOp() {
		Operator op2 = new Operator(8,1);
		Operator op3 = new Operator(7, 14);
		Konstante konst1 = new Konstante(5);
		
		
		
		long expected = konst1.evaluate();
		long actual = 5;
		assertEquals(expected, actual);
	}
}
