package fundamentals;

import java.util.Scanner;

public class Program_31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit : ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 0: System.out.println("zero");
				break;
		case 1: System.out.println("one");
				break;
		case 2: System.out.println("two");
				break;
		case 3: System.out.println("three");
				break;
		case 4: System.out.println("four");
				break;
		case 5: System.out.println("five");
				break;
		case 6: System.out.println("six");
				break;
		case 7: System.out.println("seven");
				break;
		case 8: System.out.println("eight");
				break;
		case 9: System.out.println("nine");
				break;
		default: System.out.println("Only digits are allowed(0-9)");
		}
		sc.close();

	}

}

/*
WAP to accept a digit from user and print it in words.
Input = 7
output = seven
*/