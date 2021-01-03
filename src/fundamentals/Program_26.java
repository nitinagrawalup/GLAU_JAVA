package fundamentals;

import java.util.Scanner;

public class Program_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num2+" is smaller than "+num1);
		}else if(num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println("Both are equual.");
		}
		sc.close();

	}

}
/*
WAP to accept three numbers from user and print the smallest of the
three on output screen.
*/