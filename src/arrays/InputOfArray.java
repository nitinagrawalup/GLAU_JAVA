package arrays;

import java.util.Scanner;

public class InputOfArray {

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length/size of array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element at " + i + " index : ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element at " + i + " index : " + arr[i]);

		}
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.println("__________________________");
		printArray(arr);
	}

}
