package fundamentals;

import java.util.Scanner;

public class Program_41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		boolean result = isEven(num);
		System.out.println(num + " is even ? "+result);
		sc.close();

	}
	private static boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
		
	}
}
/*
 WAP to create a method called isEven which accept one argument of
type int and return a boolean value true if number is even and false if
number is odd.
*/
