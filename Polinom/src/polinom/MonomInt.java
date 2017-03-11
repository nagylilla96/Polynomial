/**
 * MonomInt class
 * The class is for monoms with integer coefficients
 *
 * @author Nagy Lilla
 * @version 11 Mar 2017
 */

package polinom;

public class MonomInt extends Monom implements Comparable{
	Integer coeff;
	Integer grad;
	
	/**
    *
    * MonomReal constructor
    *
    * @param coeff Integer variable for the coefficient of the monom 
    * @param grad Integer variable for the grad of the monom
    * @see MonomInt
    */
	protected MonomInt(Integer coeff, Integer grad) {
		this.coeff = coeff;
		this.grad = grad;
	}
	
	/**
    *
    * coefficient getter
    *
    * @return coefficient
    * @see MonomInt
    */
	public Object getCoeff() {
		return (Integer) coeff;
	}

	/**
    *
    * coefficient setter
    *
    * @param coeff Integer variable for the monom's coefficient
    * @see MonomInt
    */
	public void setCoeff(Object coeff) {
		this.coeff = (Integer) coeff;
	}

	/**
    *
    * grad getter
    *
    * @return grad
    * @see MonomInt
    */
	public Object getGrad() {
		return (Integer) grad;
	}

	/**
    *
    * grad setter
    *
    * @param grad Integer variable for the monom's grad
    * @see MonomInt
    */
	public void setGrad(Object grad) {
		this.grad = (Integer) grad;
	}
	
	/**
    *
    * The method adds two monom's coefficients, and returns the resulting monom
    *
    * @param m Monom
    * @return the result MonomInt
    * @see MonomInt
    */
	@Override
	protected Monom add(Monom m) {
		MonomInt mr = (MonomInt) m;
		mr.setCoeff(this.coeff + mr.coeff);
		return mr;
	}

	/**
    *
    * The method subtracts two monom's coefficients, and returns the resulting monom
    *
    * @param m Monom
    * @return the result MonomInt
    * @see MonomInt
    */
	@Override
	protected Monom subtract(Monom m) {
		if (m.getClass().equals(MonomReal.class)) {
			MonomReal mr = (MonomReal) m;
			mr.setCoeff(this.coeff - (Double) mr.getCoeff());
			return mr;
		}
		MonomInt mr = (MonomInt) m;
		mr.setCoeff(this.coeff - (Integer) mr.getCoeff());
		return mr;
	}
	
	/**
    *
    * The method multiplies two monom's coefficients, and returns the resulting monom
    *
    * @param m Monom
    * @return the result MonomInt
    * @see MonomInt
    */
	@Override
	protected Monom multiply(Monom m) {
		MonomInt mr = new MonomInt((int) this.coeff * (int) m.getCoeff(), (int) this.grad + (int) m.getGrad());
		return mr;
	}
	
	/**
    *
    * The method divides two monom's coefficients, and returns the resulting monom
    *
    * @param m Monom
    * @return the result MonomInt
    * @see MonomInt
    */
	@Override
	protected Monom divide(Monom m) {
		Monom mr = new MonomReal(this.coeff / ((Number) (m.getCoeff())).doubleValue(), this.grad - ((Number) (m.getGrad())).intValue());
		return mr;
	}
	
	/**
    *
    * The method differentiates the current monom and returns it
    *
    * @return the result MonomReal
    * @see MonomInt
    */
	@Override
	protected Monom differentiate() {
		this.coeff *= this.grad;
		if (this.grad != 0) this.grad --;
		return this;
	}
	
	/**
    *
    * The method integrates the current monom and returns it
    *
    * @return the result MonomReal
    * @see MonomInt
    */
	@Override
	protected Monom integrate() {
		++this.grad;
		MonomReal mr = new MonomReal(this.coeff / (Double) (this.grad).doubleValue(), this.grad);
		return mr;
	}
	
	/**
    *
    * The method compares the monoms based on their grads
    *
    * @return the result in int
    * @see MonomInt
    */
	@Override
	public int compareTo(Object o) {
		if (this.grad.compareTo((Integer) ((MonomInt) o).getGrad()) > 0) return -1;
		if (this.grad.equals(((MonomInt) o).getGrad())) return 0;
		return 1;
	}

	/**
    *
    * The method inverts the coefficient of the monom
    *
    * @see MonomReal
    */
	@Override
	public void invertCoeff() {
		this.coeff = - this.coeff;
		
	}
}
