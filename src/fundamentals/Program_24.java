package fundamentals;

import java.util.Scanner;

public class Program_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name : ");
		String fname = sc.next();
		System.out.print("Enter the middle name : ");
		String mname = sc.next();
		System.out.print("Enter the last name : ");
		String lname = sc.next();
		
		System.out.println("<--Output-->");
		System.out.println("First name : "+fname);
		System.out.println("Middle name : "+mname);
		System.out.println("Second name : "+lname);
		
		sc.close();

	}

}

/*
WAP to accept first name, middle name & last name form user and print
them on output screen
*/