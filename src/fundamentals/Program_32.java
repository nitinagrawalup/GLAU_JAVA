package fundamentals;

import java.util.Scanner;

public class Program_32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = Math.abs(sc.nextInt());
		int rem =0;
		while(num>0) {
			rem = num %10;
			num = num/10;
			
			switch(rem) {
			
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
			
		}
		sc.close();

	}

}

/*
WAP to accept a number form user and print all its digits in word.
Input = 4532
output : Two
		 Three
         Five
         Four
*/