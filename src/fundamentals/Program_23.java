package fundamentals;

import java.util.Scanner;

public class Program_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		double num2 = sc.nextInt();
		
		if(num2 ==0.0) {
			System.out.println("check the output for given input,");
		}
		else {
			double result = num1/num2;
			System.out.println(num1+" / "+num2+" = "+ result);
		}
		sc.close();

	}

}

/*
WAP to accept two numbers from user and print the result of division of
two number on the output screen.
Input : 10 & 0
Output : check the output for given input,
*/