package polinom;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolinomTest {

	/**
    *
    * Tests the case of adding two polinomials
    *
    * @see PolinomTest
    */
	@Test
	public void testPolinomAdd() {
		Polinom polinom1 = new Polinom();
		polinom1.addMonom(new MonomInt(1, 2));
		polinom1.addMonom(new MonomInt(2, 1));
		polinom1.addMonom(new MonomInt(1, 0));
		Polinom polinom2 = new Polinom();
		polinom2.addMonom(new MonomInt(3, 3));
		polinom2.addMonom(new MonomInt(3, 1));
		polinom2.addMonom(new MonomInt(2, 0));
		Polinom result = polinom1.addPolinom(polinom2);
		assertEquals("0", 3, result.getMonoms().get(0).getCoeff());
		assertEquals("0", 3, result.getMonoms().get(0).getGrad());
		assertEquals("1", 1, result.getMonoms().get(1).getCoeff());
		assertEquals("1", 2, result.getMonoms().get(1).getGrad());
		assertEquals("2", 5, result.getMonoms().get(2).getCoeff());
		assertEquals("2", 1, result.getMonoms().get(2).getGrad());
		assertEquals("3", 3, result.getMonoms().get(3).getCoeff());
		assertEquals("3", 0, result.getMonoms().get(3).getGrad());		
	}
	
	/**
    *
    * Tests the case of subtracting two polinomials
    *
    * @see PolinomTest
    */
	@Test
	public void testPolinomSubtract() {
		Polinom polinom1 = new Polinom();
		polinom1.addMonom(new MonomInt(1, 2));
		polinom1.addMonom(new MonomInt(2, 1));
		polinom1.addMonom(new MonomInt(1, 0));
		Polinom polinom2 = new Polinom();
		polinom2.addMonom(new MonomInt(3, 3));
		polinom2.addMonom(new MonomInt(3, 1));
		polinom2.addMonom(new MonomInt(2, 0));
		Polinom result = polinom1.subtractPolinom(polinom2);
		assertEquals("0", -3, result.getMonoms().get(0).getCoeff());
		assertEquals("0", 3, result.getMonoms().get(0).getGrad());
		assertEquals("1", 1, result.getMonoms().get(1).getCoeff());
		assertEquals("1", 2, result.getMonoms().get(1).getGrad());
		assertEquals("2", -1, result.getMonoms().get(2).getCoeff());
		assertEquals("2", 1, result.getMonoms().get(2).getGrad());
		assertEquals("3", -1, result.getMonoms().get(3).getCoeff());
		assertEquals("3", 0, result.getMonoms().get(3).getGrad());		
	}
	
	/**
    *
    * Tests the case of multiplying two polinoms
    *
    * @see PolinomTest
    */
	@Test
	public void testPolinomMultiply() {
		Polinom polinom1 = new Polinom();
		polinom1.addMonom(new MonomInt(1, 2));
		polinom1.addMonom(new MonomInt(2, 1));
		polinom1.addMonom(new MonomInt(1, 0));
		Polinom polinom2 = new Polinom();
		polinom2.addMonom(new MonomInt(3, 3));
		polinom2.addMonom(new MonomInt(3, 1));
		polinom2.addMonom(new MonomInt(2, 0));
		Polinom result = polinom1.multiplyPolinom(polinom2);
		assertEquals("0", 3, result.getMonoms().get(0).getCoeff());
		assertEquals("0", 5, result.getMonoms().get(0).getGrad());
		assertEquals("1", 6, result.getMonoms().get(1).getCoeff());
		assertEquals("1", 4, result.getMonoms().get(1).getGrad());
		assertEquals("2", 6, result.getMonoms().get(2).getCoeff());
		assertEquals("2", 3, result.getMonoms().get(2).getGrad());
		assertEquals("3", 8, result.getMonoms().get(3).getCoeff());
		assertEquals("3", 2, result.getMonoms().get(3).getGrad());
		assertEquals("4", 7, result.getMonoms().get(4).getCoeff());
		assertEquals("4", 1, result.getMonoms().get(4).getGrad());
		assertEquals("5", 2, result.getMonoms().get(5).getCoeff());
		assertEquals("5", 0, result.getMonoms().get(5).getGrad());
		
	}


}
