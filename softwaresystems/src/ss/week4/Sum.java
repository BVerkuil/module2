package ss.week4;

public class Sum implements Function {

	private Function g;
	private Function h;
	
	public Sum(Function g, Function h) {
		this.g = g;
		this.h = h;
	}
	
	public double apply(double number) {
		return g.apply(number) + h.apply(number);
	}

	public Function derivative() {
		return new Sum(g.derivative(), h.derivative());
	}
	
	public String toSting() {
		return g.toString() + h.toString();
	}

}
