package arrays;

import java.util.Scanner;
/**
 * 
 * WAP to populate the array using the integer values in the 
 * range 1 to N(both inclusive) in the order - 1,3,.......4,2. 
 * 																
 * @author Nitin Agrawal
 * 
 * @since   2021-01-07 
 */
public class PopulateArray {

	public static int[] arrange(int[] arr, int n) {
		if (n % 2 == 0) {
			int count = 0, lastcount = n;
			for (int i = 0; i < n / 2; i++) {

				arr[i] = ++count;
				count++;

			}

			for (int i = (n / 2); i < n; i++) {

				arr[i] = lastcount;
				lastcount -= 2;
			}

		} else {
			int count = 0, lastcount = n - 1;

			for (int i = 0; i <= (n - 1) / 2; i++) {
				arr[i] = ++count;
				count++;
			}

			for (int i = (n / 2) + 1; i < n; i++) {
				arr[i] = lastcount;
				lastcount -= 2;
			}

		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element at " + i + " index : " + arr[i]);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length/size of Array : ");

		int size = sc.nextInt();
		int[] arr = new int[size];
		int Newarr[] = arrange(arr, size);
		printArray(Newarr);
		sc.close();
	}

}
