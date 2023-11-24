package Oving3;

import java.util.Scanner;

public class Oppgave2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true){
            boolean prime = true;
            System.out.println("Sjekk nummer (trykk 0 for å avslutte): ");
            int number = in.nextInt();

            if(number == 0){
                break;
            }

            for(int index = 2; index < number; index++) {
                if(number%index == 0){
                    prime = false;
                    break;
                }
            }

            if(prime){
                System.out.println("Nummeret er et primtall");
            }
            else{
                System.out.println("Nummeret er ikke et primtall");
            }
        }
        in.close();
    }
}
