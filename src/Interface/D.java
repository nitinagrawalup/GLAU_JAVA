package Interface;

public class D implements A,B,C{
	
	public void displayD() {
		System.out.println("Display D ");
	}

	@Override
	public void displayC() {
		System.out.println("Display C ");
	}

	@Override
	public void displayB() {
		System.out.println("Display B ");	
	}

	@Override
	public void displayA() {
		System.out.println("Display A ");
	}
	
	
}
