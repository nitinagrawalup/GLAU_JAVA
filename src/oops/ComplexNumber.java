package oops;

public class ComplexNumber {

	private int real;
	private int imaginary;
	public ComplexNumber(int i, int j) {
		this.setReal(i);
		this.setImaginary(j);
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImaginary() {
		return imaginary;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	public void print() {
		System.out.println(this.real+ " + " + this.imaginary+"i");
	}
	
	public void add(ComplexNumber c2) {
		this.real = this.real+c2.real;
		this.imaginary=this.imaginary+c2.imaginary;
	}
	public void multiply(ComplexNumber c2) {
		//Logic for ComplexNumber multiplication
		int NewReal = this.real*c2.real - this.imaginary*c2.imaginary;
		int NewImage =this.real*c2.imaginary + this.imaginary*c2.real;
		
		this.real = NewReal;
		this.imaginary =NewImage;
		
	}
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		int NewRealNumber=c1.real+c2.real;
		int NewImagNumber=c1.imaginary+c2.imaginary;
		
		ComplexNumber c4 = new ComplexNumber(NewRealNumber,NewImagNumber);
		
		return c4;
	}
	
}
