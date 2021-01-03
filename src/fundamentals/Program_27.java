package fundamentals;

import java.util.Scanner;

public class Program_27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		sc.close();

	}

}

/*
WAP to accept a number from user and check whether number is even
or odd. For even number print number is even and for odd number print
number is odd.
*/