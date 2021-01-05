package fundamentals;

import java.util.Scanner;

public class Program_43 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		boolean result = isPalindrome(num);
		System.out.println(num + " is palindrome ? "+result);
		sc.close();

	}
	private static boolean isPalindrome(int num) {
		
		int originalNumber = num;
		if (originalNumber == reverse(num)) {
            return true;
        } else {
            return false;
        }

		
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
WAP to create a method called isPalindrome, which accept one
argument and return a boolean value true if number is palindrome else
false. This function will use the reverse function for reversing the givn
number.
*/