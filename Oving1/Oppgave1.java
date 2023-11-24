package Oving1;

import java.util.Scanner;

//1 tomme = 2.54 cm     2 tommer = 5.08 cm    4.5 = 11.43 cm

public class Oppgave1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);  

        System.out.println("How many inches? ");
        double inches = in.nextDouble();

        in.close();

        double cm = inches * 2.54;

        System.out.println(inches + " inches is roughly " + cm + " centimeters");
    }
}