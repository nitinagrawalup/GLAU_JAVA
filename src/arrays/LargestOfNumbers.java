package arrays;

import java.util.Scanner;

public class LargestOfNumbers {

	private static int [] InputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length/size of Array : ");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter the element at index" +" ["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
		
	}
	public static void main(String[] args) {
		
		int arr[] = InputArray();
		System.out.println("______________________");
		int largestNumber =largest(arr);
		System.out.println("LargestOfNumbers in the array : "+largestNumber);

	}
	private static int largest(int[] arr) {
		
		int max =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
		
	}

}
