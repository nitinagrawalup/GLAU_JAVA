package fundamentals;

import java.util.Scanner;

public class Program_30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = Math.abs(sc.nextInt());
		int rem =0;
		while(num>0) {
			rem = num %10;
			num = num/10;
			
			System.out.print(rem+ " ");
		}
		sc.close();

	}

}
/*
WAP to accept a number form user and print all its digits
*/