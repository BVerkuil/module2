package ss.week4;

public class Product implements Function {

	private double func1;
	private double func2;
	
	public Product(double func1, double func2) {
		this.func1 = func1;
		this.func2 = func2;
	}
	
	public double apply(double number) {
		return func1 * func2;
	}

	public Function derivative() {
		return new Product(0, 0);
	}

}

