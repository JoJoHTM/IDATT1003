package Oving5;

public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("Fraction must have a non-zero denominator");
        }
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public Fraction(double numerator){
        this.numerator = numerator;
        this.denominator = 1;
    }

    public void sumFraction(double inputNumerator, double inputDenominator){
        if(denominator == inputDenominator){
            numerator += inputNumerator;
        }
        else{
            numerator = numerator*inputDenominator + inputNumerator*denominator;
            denominator = denominator*inputDenominator;
        }
    }

    public void subtractFraction(double inputNumerator, double inputDenominator){
        if(denominator == inputDenominator){
            numerator -= inputNumerator;
        }
        else{
            numerator = numerator*inputDenominator - inputNumerator*denominator;
            denominator = denominator*inputDenominator;
        }
    }

    public void divideFraction(double inputNumerator, double inputDenominator){
        numerator = numerator*inputDenominator;
        denominator = denominator*inputNumerator;
    }

    public void multiplyFraction(double inputNumerator, double inputDenominator){
        this.numerator = this.numerator*inputNumerator;
        this.denominator = this.denominator*inputDenominator;
    }

    public double getNumerator(){
        return this.numerator;
    }

    public double getDenominator(){
        return this.denominator;
    }
}
