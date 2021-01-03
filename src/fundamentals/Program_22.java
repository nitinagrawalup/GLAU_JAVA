package fundamentals;

import java.util.Scanner;

public class Program_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		String name = sc.nextLine();
		System.out.print("Age : ");
		int age = sc.nextInt();
		System.out.print("Gender : ");
		char gender = sc.next().charAt(0);
		
		System.out.println("<--Output-->");
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
		System.out.println("Gender : "+gender);
		
		sc.close();

	}

}

/*
WAP to accept name, age, gender form user and print them on output
screen.
*/