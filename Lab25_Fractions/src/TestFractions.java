public class TestFractions
{
  public static void testConstructors()
  {
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction(7);
    Fraction f3 = new Fraction(12, -20);
    Fraction f4 = new Fraction(f3);

    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
    System.out.println("f3 = " + f3);
    System.out.println("f4 = " + f4);
    System.out.println();
  }

  public static void testArithmetic()
  {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(1, 3);

    Fraction sum = f1.add(f2);
    System.out.println(f1 + " + " + f2 + " = " + sum);
System.out.println("the answer should be 5/6 ");
    
    Fraction abc = new Fraction(1, 2);
    Fraction a = abc.subtract(f2);
    System.out.println(abc + " - " + f2 + " = " + a);
    System.out.println("The answer should be 1/6");
    
    Fraction ae = abc.subtract(3);
    System.out.println(abc + " - " + 3 + " = " + ae);
    	System.out.println("The answer should be -5/3" );
    
    Fraction product = f1.multiply(f2);
    System.out.println(f1 + " * " + f2	 + " = " + product);
    System.out.println("The answer should be 1/6");

    
    System.out.println(f1 + " * " + 7 + " = " + f1.multiply(7));
    System.out.println("The answer should be 7/2");
    
    
    
    
  }

  public static void testValues()
  {
    Fraction f = new Fraction(2, 3);
    System.out.println(f + " = " + f.getValue());
    System.out.println("the answer should be 0.666...");
  }

  public static void main(String[] args)
  {
    testConstructors();
    testArithmetic();
    testValues();
  }
}
