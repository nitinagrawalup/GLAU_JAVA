package fundamentals;

import java.util.Scanner;

public class Program_28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if(num%5==0) {
			System.out.println("Number is divisible by 5");
		}else {
			System.out.println("Number is not divisible by 5");
		}
		
		sc.close();

	}

}

/*
WAP to accept a number from user and check whether it is divisible by
5. If number is divisible by 5 print Number is divisible by 5 else print
number is not divisible by 5.
*/