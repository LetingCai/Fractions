/**
 * Fraction.java
 * A class for representing a fraction
 * @author your name here
 * @since the date here
 */
public class Fraction
{
    /** instance variable for the numerator */
    private int num;
    /** instance variable for the denominator */
    private int denom;

    /**
     * zero parameter constructor that sets numerator to zero and denominator to 1
     */
    public Fraction()       // no-args constructor
    {
        num=0;
        denom=1;
    }
    /**
     * one parameter constructor that sets numerator to n and denominator to 1
     * @param n the numerator of the fraction
     */
    public Fraction(int n)
    {
        num = n;
        denom = 1;
    }
    /**
     * two parameter constructor that sets numerator to n and denominator to d
     *
     * @param n the numerator of the fraction
     * @param d the denominator of the fraction
     */
    public Fraction(int n, int d)
    {
        num = n;
        denom = d;
    }
    /**
     * copy constructor makes a copy of the parameter "other"
     * @param other a Fraction to be copied
     */
    public Fraction(Fraction other)  // copy constructor
    {
        num = other.num;
        denom = other.denom;
    }

    // *** public methods ***

    /** Returns the sum of this fraction and other
     * @param other a Fraction that is to be added to the current fraction
     * @return the sum of this fraction and other
     */
    public Fraction add(Fraction other)
    {
        int numerator = (num*other.denom)+(other.num*denom);
        int denominator =denom*other.denom;
        return new Fraction(numerator,denominator);
    }

    /** Returns the sum of this fraction and m
     * @param m the integer we are adding the fraction to
     * @return the sum of this Fraction and m
     */
    public Fraction add(int m)
    {
        int numerator = denom*m+num;
        return new Fraction(numerator, denom);
    }

    /** Returns the product of this fraction and other
     * @param other the Fraction that is to be multiplied by the current fraction
     * @return the product of this fraction and other
     */
    public Fraction multiply(Fraction other)
    {
        int numerator=num*other.num;
        int denominator = denom*this.denom;
        return new Fraction(numerator,denominator);
    }

    /** Returns the product of this fraction and m
     * @param m the integer that we are multiplying the current fraction by
     * @return a Fraction that is the product of this fraction and m
     */
    public Fraction multiply(int m)
    {
        int numerator = m*denom*num;
        return new Fraction(numerator,denom);
    }

    /** Returns the value as a double of this fraction as a double
     * @return the value as a double of this fraction as a double
     */
    public double getValue()
    {
        return num*1.0/denom;
    }

    /** Returns a string representation of this fraction
     * @return the string representation of the fraction
     */
    public String toString()
    {
        return num+"/"+denom;
    }


    /** Reduces this fraction by the gcf and makes denom > 0 */
    public void reduce()
    {
        int gcf = gcf(num,denom);
        num/=gcf;
        denom/=gcf;
    }

    // *** private methods ***

    /** Returns the greatest common factor of two positive integers
     * @param n a positive integer representing the numerator
     * @param d a positive integer representing the denominator
     *  @return the greatest common divisor of two positive integers
     *
     */
    private int gcf(int n, int d) {
        int i=9;
        while (!(n % i == 0 && d % i == 0)){
            if(i<=0){
                return 1;
            }
            i--;
        }
        return i;
    }
}
