package Oving3;

import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Hvilken del av gangetabellen har du lyst til å se? ");
        int from = in.nextInt();
        int to = in.nextInt();

        in.close();

        while(from <= to){
            int index = 1;
            System.out.println(from + "-gangen:");
            while(index <= 10){
                int total = index*from;
                System.out.println(from + " x " + index + " = " + total);
                index++;
            }
            from++;
        }
    }
}
