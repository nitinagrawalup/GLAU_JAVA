package fundamentals;

import java.util.Scanner;

public class Program_42 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("Reversed Number : " + reverse(number));
		sc.close();

	}

	private static int reverse(int number) {
		int reminder = 0;
		int reversedNumber = 0;
		for (; number != 0;) {

			reminder = number % 10;
			reversedNumber = reversedNumber * 10 + reminder;
			number = number / 10;
		}
		return reversedNumber;
	}

}
/*
WAP to create a method called reverse, which accept one integer
argument and return a integer which is reverse of the input.
*/ 
