package polinom;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolinomTest {

	@Test
	public void testAddMonom() {
		Monom m1 = new MonomInt(2, 3);
		Monom m2 = new MonomInt(2, 3);
		m1.add(m2);
		assertEquals("Result should be coeff = 4", 4, m1.getCoeff());
		assertEquals("Result should be grad = 3", 3, m1.getGrad());
		Monom m3 = new MonomReal(2.4, 1);
		Monom m4 = new MonomInt(3, 1);
		m3.add(m4);
		assertEquals("Result should be coeff = 5.4", 5.4, m1.getCoeff());
		assertEquals("Result should be grad = 1", 1, m1.getGrad());
		Monom m5 = new MonomInt(3, 0);
		Monom m6 = new MonomReal(2.5, 0);
		m5.add(m6);
		assertEquals("Result should be coeff = 5.5", 5.5, m1.getCoeff());
		assertEquals("Result should be grad = 0", 0, m1.getGrad());
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
