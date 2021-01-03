package fundamentals;

import java.util.Scanner;

public class Program_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for boolean data type");
		boolean num1 = sc.nextBoolean();
		System.out.print("Enter the value for char data type");
		char num2 = sc.next().charAt(0);
		System.out.print("Enter the value for byte data type");
		byte num3 = sc.nextByte();
		System.out.print("Enter the value for short data type");
		short num4 = sc.nextShort();
		System.out.print("Enter the value for int data type");
		int num5 = sc.nextInt();
		System.out.print("Enter the value for long data type");
		long num6 = sc.nextLong();
		System.out.print("Enter the value for float data type");
		float num7 = sc.nextFloat();
		System.out.print("Enter the value for double data type");
		double num8 = sc.nextDouble();
		
		System.out.println("<--Output-->");
		
		System.out.println("boolean ->" + num1);
		System.out.println("char    ->" + num2);
		System.out.println("byte    ->" + num3);
		System.out.println("short   ->" + num4);
		System.out.println("int     ->" + num5);
		System.out.println("long    ->" + num6);
		System.out.println("float   ->" + num7);
		System.out.println("double  ->" + num8);
		
		sc.close();

	}

}
