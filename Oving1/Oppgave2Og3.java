package Oving1;

import java.util.Scanner;

public class Oppgave2Og3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many hours? ");
        int hours = in.nextInt();

        System.out.println("How many minutes? ");
        int minutes = in.nextInt();

        System.out.println("How many seconds? ");
        int seconds = in.nextInt();

        in.close();

        int totalSeconds = hours*3600 + minutes*60 + seconds;

        System.out.printf("%d hour/s, %d minutes and %d seconds is equal to %d seconds \n", hours, minutes, seconds, totalSeconds);


        hours = totalSeconds/3600;
        seconds = totalSeconds%3600;
        minutes = seconds/60;
        seconds = seconds%60;

        System.out.printf("%d seconds is the same as %d hour/s, %d minutes and %d seconds",totalSeconds,hours,minutes,seconds);
    }
}
