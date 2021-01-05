package fundamentals;

import java.util.Scanner;

public class Program_37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num , count = 0;
		do {
			System.out.print("Enter a number : ");
			num = sc.nextInt();
			if(num%2 == 0) {
				++count;
			}
		}while(count!=20);
		sc.close();
		System.out.println("That's Great!! You entered 20 even numbers");
	}

}

/*
WAP to accept numbers from user until user enter 20 even
numbers.
*/