package fundamentals;

import java.util.Scanner;

public class Program_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the username : ");
		String username =sc.next();
		System.out.println("Welcome "+username);
		sc.close();

	}

}
