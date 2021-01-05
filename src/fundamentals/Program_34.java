package fundamentals;

import java.util.Scanner;

public class Program_34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int rev; 
		   while(num != 0) 
		   { 
		      rev = num%10; 
		      System.out.print(rev); 
		      num = num/10; 
		   } 
		sc.close();

	}

}
/*
WAP to accept a number and print the number in reverse.
Input = 12345
output = 54321
*/