package OOPLabs.lab1;

import java.util.Scanner;

public class Fraction implements Operation<String, Fraction>{

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;

        try {
            double div = numerator/denominator;
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль!!!");
            System.exit(0);
        }

    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int commonDivisor(Fraction fraction){
        return denominator * fraction.getDenominator();
    }

    @Override
    public String toString() {
        return "Fraction{" +
                 numerator +
                "/" + denominator +
                '}';
    }

    @Override
    public String sum(Fraction fraction) {
        return new Fraction(numerator * fraction.getDenominator() + fraction.getNumerator() * denominator,
                commonDivisor(fraction)).toString();
    }

    @Override
    public String difference(Fraction fraction) {
        return new Fraction(numerator * fraction.getDenominator() - fraction.getNumerator() * denominator,
                commonDivisor(fraction)).toString();
    }

    @Override
    public String multiply(Fraction fraction) {
       return new Fraction(numerator * fraction.getNumerator(), denominator * fraction.getDenominator()).toString();
    }

    @Override
    public String division(Fraction fraction) {
        return new Fraction(numerator * fraction.getDenominator(), denominator * fraction.getNumerator()).toString();
    }
}
