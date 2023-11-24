package Oving2;

import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("What year do you wish to check? ");
        int year = in.nextInt();

        in.close();

        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("Year " + year + " is a leap year.");
                }
                else{
                    System.out.println("Year " + year + " is not a leap year.");
                }
            }
            else{
                System.out.println("Year " + year + " is a leap year.");
            }
        }
        else{
            System.out.println("Year " + year + " is not a leap year.");
        }
}   
}