package arrays;

public class PrimitiveVsNonPrimitive {

	public static void main(String[] args) {

		int i = 10;
		System.out.println("Value of i before increment function is called is " + i);
		increment(i);
		System.out.println("Value of i after increment function is called is " + i);

		System.out.println("___________________________");
		System.out.println();

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.print("Elements of arr[] before incrementArray function is called ");
		printArray(arr);
		System.out.println();
		incrementArray(arr);
		System.out.print("Elements of arr[]  after incrementArray function is called ");
		printArray(arr);
		System.out.println();
		System.out.println("___________________________");
		System.out.println();
		noincrementArray(arr);
		System.out.print("Elements of arr[]  after noincrementArray function is called ");
		printArray(arr);
		System.out.println();
	}

	private static void noincrementArray(int[] arr) {
		arr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1;
		}

	}

	private static void incrementArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1;
		}

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void increment(int i) {

		i = i + 1;

	}

}
