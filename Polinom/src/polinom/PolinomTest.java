/**
 * PolinomTest class
 * The Polinom tester class
 *
 * @author Nagy Lilla
 * @version 10 Mar 2017
 */

package polinom;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolinomTest {
	
	
	/**
    *
    * Tests the case of adding two monoms with integer coefficient
    *
    * @see PolinomTest
    */
	@Test
	public void testAddMonomIntInt() {
		Monom m1 = new MonomInt(2, 3);
		Monom m2 = new MonomInt(2, 3);
		Monom result1 = m1.add(m2);
		assertEquals("Result should be coeff = 4", 4, result1.getCoeff());
		assertEquals("Result should be grad = 3", 3, result1.getGrad());
	}

	/**
    *
    * Tests the case of adding two monoms, one with real and the other one with integer coefficients
    *
    * @see PolinomTest
    */
	@Test
	public void testAddMonomRealInt() {
		Monom m3 = new MonomReal(2.4, 1);
		Monom m4 = new MonomInt(3, 1);
		Monom result2 = m3.add(m4);
		assertEquals("Result should be coeff = 5.4", 5.4, result2.getCoeff());
		assertEquals("Result should be grad = 1", 1, result2.getGrad());
	}
	
	
	/**
    *
    * Tests the case of adding two monoms with integer coefficient and zero grad
    *
    * @see PolinomTest
    */
	@Test
	public void testAddMonomZeroInt() {
		Monom m3 = new MonomInt(2, 0);
		Monom m4 = new MonomInt(3, 0);
		Monom result2 = m3.add(m4);
		assertEquals("Result should be coeff = 5", 5, result2.getCoeff());
		assertEquals("Result should be grad = 0", 0, result2.getGrad());
	}
	
	
	/**
    *
    * Tests the case of adding two monoms with real coefficient
    *
    * @see PolinomTest
    */
	@Test
	public void testAddMonomRealReal() {
		Monom m3 = new MonomReal(2.5, 0);
		Monom m4 = new MonomReal(3.5, 0);
		Monom result2 = m3.add(m4);
		assertEquals("Result should be coeff = 6.0", 6.0, result2.getCoeff());
		assertEquals("Result should be grad = 0", 0, result2.getGrad());
	}

	/**
    *
    * Tests the case of subtracting two monoms with integer coefficient
    *
    * @see PolinomTest
    */
	@Test
	public void testSubMonomIntInt() {
		Monom m1 = new MonomInt(5, 2);
		Monom m2 = new MonomInt(3, 2);
		Monom result1 = m1.subtract(m2);
		assertEquals("Result should be coeff = 2", 2, result1.getCoeff());
		assertEquals("Result should be grad = 2", 2, result1.getGrad());
	}
	
	/**
    *
    * Tests the case of subtracting two monoms, one with real and one with integer coefficient
    *
    * @see PolinomTest
    */
	@Test
	public void testSubMonomRealInt() {
		Monom m1 = new MonomReal(7.2, 2);
		Monom m2 = new MonomInt(3, 2);
		Monom result1 = m1.subtract(m2);
		assertEquals("Result should be coeff = 4.2", 4.2, result1.getCoeff());
		assertEquals("Result should be grad = 2", 2, result1.getGrad());
	}
	
	/**
    *
    * Tests the case of subtracting two monoms with real coefficient
    *
    * @see PolinomTest
    */
	@Test
	public void testSubMonomRealReal() {
		Monom m1 = new MonomReal(7.2, 2);
		Monom m2 = new MonomReal(4.2, 2);
		Monom result1 = m1.subtract(m2);
		assertEquals("Result should be coeff = 3.0", 3.0, result1.getCoeff());
		assertEquals("Result should be grad = 2", 2, result1.getGrad());
	}
	
	
	@Test
	public void testGetMonoms() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMonoms() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPolinom() {
		fail("Not yet implemented");
	}

}
