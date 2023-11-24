package oving5;

public class FractionClient {
    public static void main(String[] args){
        Fraction brok = new Fraction(4,3);

        brok.subtractFraction(2, 3);
        double numerator = brok.getNumerator();
        double denominator = brok.getDenominator();

        System.out.println(numerator + "/" + denominator);
    }
}
