package oops;

public class FractionUse {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(4,6);
		f1.print();
		f1.setNumerator(12);
		f1.print();
		System.out.println("Numerator = "+f1.getNumerator());
		System.out.println("_______________________");
		System.out.println("Before Increment value of fraction 1 ");
		f1.print();
		System.out.println("After Increment value of fraction 1 ");
		f1.increment();
		f1.print();
		System.out.println("_______________________");
		Fraction f2 = new Fraction(4,8);
		System.out.println("Before Addition value of fraction 1 and fraction 2");
		f1.print();
		f2.print();
		f1.add(f2);
		System.out.println("After Addition value of fraction 1 and fraction 2");
		f1.print();
		f2.print();
		System.out.println("_______________________");
		System.out.println("Before Addition value of fraction 1 and fraction 2");
		f1.print();
		f2.print();
		System.out.println("After Addition value of fraction 3 (i.e, fraction 1+ fraction 2)");
		Fraction f3 = Fraction.add(f1,f2);
		f3.print();
		System.out.println("_______________________");
		System.out.println("Before Subtraction value of fraction 1 and fraction 2");
		f1.print();
		f2.print();
		System.out.println("After Subtraction value of fraction 1");
		f1.subtract(f2);
		f1.print();
		System.out.println("_______________________");
		System.out.println("Before Multiplication value of fraction 1 and fraction 2");
		f1.print();
		f2.print();
		System.out.println("After Multiplication value of fraction 1");
		f1.multiply(f2);
		f1.print();
		System.out.println("_______________________");
	}
}
