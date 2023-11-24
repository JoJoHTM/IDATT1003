package Oving6;

public class RandomList {
    public static void main(String[] args){
        java.util.Random random = new java.util.Random(); // vi lager en tilfeldigtallgenerator

        int[] antall = new int[10];
        int tall = random.nextInt(10);
        for(int i=0; i<1000; i++){
            antall[tall] += 1;
            tall = random.nextInt(10);
        }
        System.out.println("Tall : Hvor ofte det forekom");
        for(int j=0; j<antall.length; j++){
            String output = String.format("%d : %d",j,antall[j]);
            System.out.println(output);
        }
    }
}
