/**
 * Polinom class
 * The class is for polinoms 
 *
 * @author Nagy Lilla
 * @version 09 Mar 2017
 */

package polinom;

import java.util.*;

public class Polinom {
	Set<Monom> monoms = new TreeSet<>();

	protected Polinom() {
		super();
	}

	protected Polinom addMonom(Monom m) {
		this.monoms.add(m);
		return this;
	}

	public Set<Monom> getMonoms() {
		return this.monoms;
	}

	public void setMonoms(Set<Monom> monoms) {
		this.monoms = monoms;
	}

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
