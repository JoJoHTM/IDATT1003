package oving5;

import java.util.Random;

public class MinRandom {
    private Random rnd = new Random();


    public int nesteHeltall(int nedre, int ovre){
        int number = rnd.nextInt(ovre+1);
        while((number > ovre) || (number < nedre)){
            number = rnd.nextInt(ovre+1);
        }
        return number;
    }

    public double nesteDesimaltall(double nedre, double ovre){
        double number = rnd.nextDouble();
        while((number > ovre) || (number < nedre)){
            number = rnd.nextDouble();
        }
        return number;
    }
}
