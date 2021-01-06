package oops;

public class Fraction {

	private int numerator,denominator;
	//Constructor
	public Fraction(int numerator, int denominator) {
		if(denominator==0) {
			denominator=1;
		}else {
			this.numerator = numerator;
			this.setDenominator(denominator);
		}simpify();
	}
	//Getter and Setter
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setNumerator(int numerator) {
		
		this.numerator = numerator;
		simpify();
	}
	public void setDenominator(int denominator) {
		if(denominator==0) {
			denominator=1;
		}else {
			this.denominator = denominator;
		}
		simpify();
		
	}
	//Simplify function
	private void simpify() {
		
		int gcd =1;
		int smaller =Math.min(numerator, denominator);
		for(int i =2;i<=smaller;i++) {
			if(numerator%i==0 && denominator%i==0) {
				gcd=i;
			}
		}
		numerator= numerator/gcd;
		denominator=denominator/gcd;
			
	}
	//Increment function
	public void increment() {
		this.numerator = numerator+denominator;
		simpify();
	}
	//Print function
	public void print() {
		
		System.out.println("numerator/denominator = " +numerator+" / "+ denominator);
		
	}
	public void add(Fraction f2) {
		//First fraction is the fraction on which fraction is called
		//Second fraction is passed as arguments
		this.numerator = (this.numerator*f2.denominator) + (f2.numerator * this.denominator);
		this.denominator = this.denominator*f2.denominator;
		simpify();
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		
		int Newnumerator=(f1.numerator*f2.denominator) + (f2.numerator * f1.denominator);
		int Newdenominator= f1.denominator*f2.denominator;
		Fraction f3 = new Fraction(Newnumerator, Newdenominator);
		return f3;
		
	}
	public void subtract(Fraction f2) {
		this.numerator = (this.numerator*f2.denominator) - (f2.numerator * this.denominator);
		this.denominator = this.denominator*f2.denominator;
		simpify();
		
	}
	public void multiply(Fraction f2) {
		this.numerator=this.numerator*f2.numerator;
		this.denominator=this.denominator*f2.denominator;
		simpify();
		
	}
	
}
