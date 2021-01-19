package inheritance;

public class Shape {

	private int side;

	public void setSide(int side) {
		if (side == 0) {
			this.side = side;
		} else if ((side < 0 ) || (side < 3)) {
			System.out.println("Please enter valid sides");
			this.side = -1;
		} else {
			this.side = side;
		}
			
	}

	public int getSide() {
		return side;
	}

	public void printDescription() {
		System.out.println("Shape class printDescription() function called ");
	}
}
