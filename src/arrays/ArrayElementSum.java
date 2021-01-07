package arrays;

import java.util.Scanner;

public class ArrayElementSum {
	
	public static int [] InputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length/size of Array : ");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
		
	}
	public static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int SumOfArrayElement(int[] arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void printSumOfArrayElement(int num) {
		System.out.println("Sum = "+ num);
	}
	public static void main(String[] args) {
		
		int arr[] = InputArray();
		System.out.println("______________________");
		printArray(arr);
		System.out.println("______________________");		
		int num =SumOfArrayElement(arr);
		printSumOfArrayElement(num);

	}

}
