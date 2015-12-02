package softwaresystems;

public class Cijfers {
	
	private int score;

	public Cijfers(int score) {
		this.score = score;
	}
	
	private boolean passed() {
		return this.score > 70;
	}
}
