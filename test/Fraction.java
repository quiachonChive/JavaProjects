package test;

public class Fraction {
	protected int numerator;
	protected int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction() {
		this(0,1);
	}
	
	public Fraction(int numerator) {
		this(numerator, 1);
	}
	
	public Fraction add(Fraction f) {
		int num = (f.denominator * numerator) + (denominator * f.numerator);
		int denom = (denominator * f.denominator);
		Fraction result = new Fraction(num, denom);
		return result;
	}
	
	public Fraction subtract(Fraction f) {
		int num = (numerator * f.denominator) - (f.numerator * denominator);
		int denom = (denominator * f.denominator);
		Fraction result = new Fraction(num, denom);
		return result;
		
	}
	
	public Fraction multiply(Fraction f) {
		int num = numerator * f.numerator;
		int denom = denominator * f.denominator;
		Fraction result = new Fraction(num, denom);
		return result;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public static void main(String[] args) {
		Fraction f = new Fraction(1, 4);
		Fraction s = new Fraction(1, 2);
		Fraction fs = f.multiply(s);
		System.out.println(fs);
	}

}
