package fundamentals;

import java.util.Scanner;

public class Program_39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		int result = add(num1,num2);
		System.out.println(num1+" + "+num2+" = "+result);
		sc.close();

	}
	private static int add(int num1, int num2) {
		return num1+num2;
	}
}

/*
WAP to perform addition of two numbers by using a user defined
function called add. Create a method called add which accept two
arguments of type int and return an integer value by performing
addition of these two arguments.
Hint : 
	int add(int input1, int input2){
	
	}
*/