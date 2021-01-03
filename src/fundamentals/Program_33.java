package fundamentals;

import java.util.Scanner;

public class Program_33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice=0,num1,num2;
		do {
			
			System.out.println("Enter the first number : ");
			num1 = sc.nextInt();
			System.out.println("Enter the second number : ");
			num2 = sc.nextInt();
			System.out.println(num1+" + "+num2 + " = "+ (num1+num2));
			System.out.println("Enter your choice (1 ->more addition 0 ->exit) : ");
			choice = sc.nextInt();
			System.out.println("--------------------------");
		}while(choice!=0);
		sc.close();
	}

}

/*
WAP to accept two numbers from user, perform addition and display
result. Then ask user whether he want to perform more addition by
pressing 1 or 0 to exit
*/