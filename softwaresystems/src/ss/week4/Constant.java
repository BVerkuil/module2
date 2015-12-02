package ss.week4;

public class Constant implements Function {


	private double constant;
	
	public Constant(double constant) {
		this.constant = constant;
	}
	
	public double apply(double number) {
		return constant;
	}

	public Function derivative() {
		return new Constant(0);
	}
	
	public String toSting() {
		return ""+this.constant;
	}

}
