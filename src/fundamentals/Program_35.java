package fundamentals;

import java.util.Scanner;

public class Program_35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			 System.out.println("Enter a number : ");
			 int number = sc.nextInt();

             int originalNumber = number;
             int reminder = 0;
             int reversedNumber = 0;
             for (; number != 0;) {

                 reminder = number % 10;
                 reversedNumber = reversedNumber * 10 + reminder;
                 number = number / 10;
             }

             System.out.println("Reversed Number : " + reversedNumber);

             if (originalNumber == reversedNumber) {
                 System.out.println("Number " + originalNumber + " is a palindrome");
             } else {
                 System.out.println("Number " + originalNumber + " is not a palindrome");
             }
        
        sc.close();

	}

}
/*
 WAP to accept a number form user and check whether the number
is palindrome. If number is palindrome print it is palindrome else print
not a palindrome.
Input = 121
output = It is palindrome
input = 122
output = not a palindrome
*/
