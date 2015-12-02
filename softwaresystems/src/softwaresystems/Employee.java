package softwaresystems;

public class Employee {

	private int hours;
	private double rate;
	public static final int MAXHOURS = 40;
	
	public Employee(int hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}
	
	public double pay() {
		if (this.hours <= MAXHOURS) {
			return (this.hours * this.rate);
		} else {
			return ((MAXHOURS * this.rate) + ((this.hours - MAXHOURS) * (1.5 * this.rate)));
		}
	}
	
	public static void main(String[] args) {
		Employee Henk = new Employee(50, 20.00);
		
		System.out.println(Henk.pay());
	}
		
}
