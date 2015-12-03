package ss.week4;

public class Exponent implements Function{
	
	private int exponent;
	
	public Exponent(int exponent) {
		this.exponent = exponent;
	}
	
	public double apply(double number) {
		return Math.pow(number, exponent);
	}

	public Function derivative() {
		return new LinearProduct(new Exponent(exponent - 1), new Constant(exponent));
	}

}
