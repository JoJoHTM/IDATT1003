package Oving2;

import java.util.Scanner;

public class Oppgave2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is the price and weight of the first item? ");
        double price1 = in.nextDouble();
        double weight1 = in.nextDouble();

        System.out.println("What is the price and weight of the second item? ");
        double price2 = in.nextDouble();
        double weight2 = in.nextDouble();

        in.close();

        double ratio1 = price1/weight1;
        double ratio2 = price2/weight2;
        if(ratio1 < ratio2){
            System.out.println("The first item is cheaper than the second item.");
        }
        else{
            System.out.println("The second item is cheaper than the first item.");
        }
        System.out.println("First item: " + ratio1 + " NOK per gram");
        System.out.println("Second item: " + ratio2 + " NOK per gram");
    }
}
