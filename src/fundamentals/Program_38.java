package fundamentals;

import java.util.Scanner;
/**
 * 
 * WAP to accept numbers from user until the sum of all entered
 * number is less then 100.
 * 
 * @author Nitin Agrawal
 * 
 * @since   2021-01-05 
 */
public class Program_38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, sum=0;
		
		do {
			
			System.out.print("Enter a number : ");
			num = sc.nextInt();
			sum= sum + num;
			
		}while(sum<=99);
		System.out.println("Sum of above value is greater than 99.");
		sc.close();

	}

}

/*
WAP to accept numbers from user until the sum of all entered
number is less then 100.
*/