package Oving5;

public class MinRandomClient {
    public static void main(String[] args){
        MinRandom desimalTall = new MinRandom();
        MinRandom helTall = new MinRandom();

        int nummer = helTall.nesteHeltall(1, 6);
        System.out.println(nummer);
        double nummerI = desimalTall.nesteDesimaltall(0.1, 0.8);
        System.out.println(nummerI);
    }
}
