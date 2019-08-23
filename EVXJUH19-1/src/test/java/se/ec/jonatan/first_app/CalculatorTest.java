package se.ec.jonatan.first_app;

import java.util.ArrayList;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	ArrayList<Double> n = new ArrayList<Double>();
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testMain() {
		n.add(1d);
		n.add(2d);
		n.add(3d);
	}

	public void testAddition() {
		n.add(1d);
		n.add(2d);
		n.add(3d);
		Assert.assertEquals(6.0, Calculator.addition(n));
	}

	public void testSubtraction() {
		n.add(1d);
		n.add(2d);
		n.add(3d);
		Assert.assertEquals(-4.0, Calculator.subtraction(n));
	}

	public void testMulti() {
		n.add(9d);
		n.add(4d);
		n.add(6d);
		Assert.assertEquals(216.0, Calculator.multiplication(n));
	}

	public void testDivision() {
		n.add(81d);
		n.add(9d);
		n.add(3d);
		Assert.assertEquals(3.0, Calculator.division(n));
	}
}
