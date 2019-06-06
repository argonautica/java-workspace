// Represents a fraction with an int numerator and int denominator
// and provides methods for adding and multiplying fractions.

public class Fraction {
	// *** instance variables ***
	private int num;
	private int denom;

	// *** Constructors ***

	public Fraction() // no-args constructor
	{
		num = 0;
		denom = 1;
	}

	public Fraction(int n) {
		num = n;
		denom = 1;
	}

	public Fraction(double x) {
		double den = 1;
		while (true) {
			double remainder = Math.abs((den * x) % 1);
			if (remainder < 0.00001 || remainder > 0.99999)
				break;
			den++;
		}
		num = (int) Math.round(den * x);
		denom = (int) den;
	}

	public Fraction(int n, int d) {
		if (d != 0) {
			num = n;
			denom = d;
			reduce();
		} else {
			throw new IllegalArgumentException("Fraction construction error: denominator is 0");
		}
	}

	public Fraction(Fraction other) // copy constructor
	{
		num = other.num;
		denom = other.denom;
	}

	// *** public methods ***

	// Returns the sum of this fraction and other
	public Fraction add(Fraction other) {
		int newNum = num * other.denom + denom * other.num;
		int newDenom = denom * other.denom;
		return new Fraction(newNum, newDenom);
	}

	// Returns the sum of this fraction and m
	public Fraction add(int m) {
		return new Fraction(num + m * denom, denom);
	}

	// Returns the product of this fraction and other
	public Fraction multiply(Fraction other) {
		int newNum = num * other.num;
		int newDenom = denom * other.denom;
		return new Fraction(newNum, newDenom);
	}

	// Returns the product of this fraction and m
	public Fraction multiply(int m) {
		return new Fraction(num * m, denom);
	}

	// Returns the value of this fraction as a double
	public double getValue() {
		return (double) num / (double) denom;
	}

	// Returns a string representation of this fraction
	public String toString() {
		return num + "/" + denom;
	}

	// *** private methods ***

	// Reduces this fraction by the gcf and makes denom > 0
	private void reduce() {
		if (num == 0) {
			denom = 1;
			return;
		}

		if (denom < 0) {
			num = -num;
			denom = -denom;
		}

		int q = gcf(Math.abs(num), denom);
		num /= q;
		denom /= q;
	}

	// Returns the greatest common factor of two positive integers
	private int gcf(int n, int d) {
		if (n <= 0 || d <= 0) {
			throw new IllegalArgumentException("gcf precondition failed: " + n + ", " + d);
		}

		if (n % d == 0)
			return d;
		else if (d % n == 0)
			return n;
		else
			return gcf(n % d, d % n);
	}

	public Fraction subtract(Fraction other) {
		// subtracts a fraction from the original fraction
		
		/*
		if (denom != f.denom) {

			num = num * f.denom;
			f.num = f.num * denom;

			int temp = denom;
			denom = denom * f.denom;
			f.denom = f.denom * temp;

			Fraction a = new Fraction(num - f.num, denom - f.denom);
			return a;
		}

		return new Fraction(num - f.num, denom - f.denom);
		*/
		
		int newNum = num * other.denom - denom * other.num;
		int newDenom = denom * other.denom;
		
		
		System.out.println("new denom = " + newDenom + "denom " + denom + "other denom " + other.denom);
		return new Fraction(newNum, newDenom);
	}

	public Fraction subtract(int a) {
		// subtracts an integer from the fraction

		Fraction b = new Fraction(a * denom, denom);
		Fraction c = new Fraction(num, denom);

		c = c.subtract(b);
		return c;
	}

	public Fraction divide(Fraction a) {
		// divides the fraction by another fraction
		return new Fraction(num * a.denom, denom * a.num);

	}

	public Fraction divide(int a) {
		// divides the fraction by an integer
		return new Fraction(num, denom * a);
	}
}