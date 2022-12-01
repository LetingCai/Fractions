public class TestFractions
{
    public static void testConstructors()
    {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(7);
        Fraction f3 = new Fraction(12, 16);
        Fraction f4 = new Fraction(f3);
        //Construct a fraction with a zero denominator too!
        //uncomment to see the try catch stop the program
        //Fraction crashFraction = new Fraction(8,0);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println();
    }
    public static void testReduce()
    {
        Fraction reducable1 = new Fraction(12, 16);
        Fraction reducable2 = new Fraction(20,15);
        Fraction notReducable1 = new Fraction(13,16);
        Fraction notReducable2 = new Fraction(19,15);

        System.out.println("reducable1 = "+reducable1);
        System.out.println("reducable2 = "+reducable2);
        System.out.println("notReducable1 = "+notReducable1);
        System.out.println("notReducable2 = "+notReducable2);
        reducable1.reduce();
        reducable2.reduce();
        notReducable1.reduce();
        notReducable2.reduce();
        System.out.println("just reduced them...");
        System.out.println("reducable1 = "+reducable1);
        System.out.println("reducable2 = "+reducable2);
        System.out.println("notReducable1 = "+notReducable1);
        System.out.println("notReducable2 = "+notReducable2);

    }
    public static void testArithmetic()
    {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);

        Fraction sum = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + sum);

        Fraction product = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + product);

        System.out.println();
    }

    public static void testValues()
    {
        Fraction f = new Fraction(2, 3);
        System.out.println(f + " = " + f.getValue());
        System.out.println();
    }

    public static void main(String[] args)
    {
        System.out.println("Testing constructors: ");
        testConstructors();
        System.out.println("Testing Arithmetic: ");
        testArithmetic();
        System.out.println("Testing Values:");
        testValues();
        System.out.println("Testing Reduce: ");
        testReduce();
    }
}