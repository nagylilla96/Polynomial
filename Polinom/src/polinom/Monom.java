package polinom;

abstract class Monom {
	
	protected abstract Monom add(Monom m);
	protected abstract Monom subtract(Monom m);
	protected abstract Monom multiply(Monom m);
	protected abstract Monom divide(Monom m);
	protected abstract Monom differentiate();
	protected abstract Monom integrate();
}
