package ss.week4;

public class Sum implements Function {

	private double func1;
	private double func2;
	
	public Sum(double func1, double func2) {
		this.func1 = func1;
		this.func2 = func2;
	}
	
	public double apply(double number) {
		return func1 + func2;
	}

	public Function derivative() {
		return new Sum(0, 0);
	}
	
	public String toSting() {
		return ""+(this.func1 + this.func2);
	}

}
