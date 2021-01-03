package fundamentals;

import java.util.Scanner;

public class Program_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.println(num1+" + "+num2 + " = "+(num1+num2));
		
		sc.close();

	}

}
/*
WAP to accept two integers from user, perform addition on them and
display the result on the output screen
*/