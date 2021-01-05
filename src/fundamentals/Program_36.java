package fundamentals;

import java.util.Scanner;

public class Program_36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("Enter a number : ");
			num = sc.nextInt();
			
		}while(num!=2000);
		sc.close();

	}

}

/*
WAP to accept a number from user until user enter 2000 as a
input
*/