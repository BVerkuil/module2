package ss.week4;

public class LinearProduct extends Product {
	
	public LinearProduct(Function g, Constant h) {
		super(g,h);
	}
	public Function derivative() {
		return new LinearProduct(g.derivative(), ((Constant) h));
	}
}

