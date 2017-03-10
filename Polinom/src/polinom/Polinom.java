/**
 * Polinom class
 * The class is for polinoms 
 *
 * @author Nagy Lilla
 * @version 10 Mar 2017
 */

package polinom;

import java.util.*;

public class Polinom {
	Set<Monom> monoms = new TreeSet<>();

	/**
    *
    * Polinom constructor which calls super()
    *
    * @see Polinom
    */
	protected Polinom() {
		super();
	}
	
	/**
    *
    * Adds a new monom to the set of monoms from the Polinom
    *
    * @param m Monom
    * @return Polinom
    * @see Polinom
    */
	protected Polinom addMonom(Monom m) {
		this.monoms.add(m);
		return this;
	}

	/**
    *
    * Gets the set of monoms from the Polinom
    *
    * @return Set<Monom> the set of monoms
    * @see Polinom
    */
	public Set<Monom> getMonoms() {
		return this.monoms;
	}

	/**
    *
    * Sets the set of monoms of the Polinom
    *
    * @param monoms of Set<Monom> type
    * @see Polinom
    */
	public void setMonoms(Set<Monom> monoms) {
		this.monoms = monoms;
	}

	
	/**
    *
    * Adds two polynomials, and finds the monoms with the same grad
    *
    * @param p Polinom
    * @return Polinom
    * @see Polinom
    */
	protected Polinom addPolinom(Polinom p) {
		Monom m2;
		Iterator<Monom> i= p.getMonoms().iterator();
		if (i.hasNext()){
			m2 = i.next();
		}
		else {
			return this;
		}
		for(Monom m1 : monoms) {
			if (m1.getGrad().equals(m2.getGrad())) {
				m1.add(m2);
				if (i.hasNext()) {
					m2 = i.next();
				}
			}
		}
		return this;
	}

}