package fundamentals;

import java.util.Scanner;

public class Program_29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = Math.abs(sc.nextInt());
		String str = Integer.toString(num);
		System.out.println("Number "+ num+ " contain only "+str.length()+" digit");
		sc.close();

	}

}

/*
WAP to accept a number form user and print number of digits in the
number.
*/