package Oving5;

public class FractionClient {
    public static void main(String[] args){
        Fraction brok = new Fraction(4,0);
    
        brok.multiplyFraction(2, 3);
        double numerator = brok.getNumerator();
        double denominator = brok.getDenominator();

        System.out.println(numerator + "/" + denominator);
    }
}
