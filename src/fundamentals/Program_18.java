package fundamentals;

import java.util.Scanner;

public class Program_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name : ");
		String name = sc.nextLine();
		System.out.print("Mobile : ");
		String mobile = sc.next();
		sc.nextLine();
		System.out.print("Email : ");
		String email = sc.nextLine();
		
		System.out.println("<-----Output----->");
		System.out.println("Name : "+name);
		System.out.println("Mobile : "+mobile);
		System.out.println("Email : "+email);
		sc.close();

	}

}

/*
WAP to declare variable to store your name (String name), mobile
no and email (String email).
Hint : use reference variable of String class for name and email.
	   String name = “Ravi”;
       String email = “ravi@gla.ac.in”;
*/