package generics;

public class GenericMethodUse {

	public static void main(String[] args) {
		
		GenericMethod obj = new GenericMethod();
		String countries[] = new String[] {"India","Pakistan","Nepal"};
		Integer numbers[]= {12,34,56,77};
		
		obj.printArray(countries);
		System.out.println("___________________________\n");
		obj.printArray(numbers);

	}

}
