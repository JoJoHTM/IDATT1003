package oppg1;

import java.util.Arrays;
import java.util.Scanner;

public class DagerIMaaneden {
    public static void main(String[] args){
        int[] month = new int[12];
        String[] monthName = {"Januar","Februar","Mars","April","Mai","Juni","Juli","August","September",
                             "Oktober","November","Desember"};

        Scanner in = new Scanner(System.in);

        for(int i=0; i<month.length; i++){
            if(i == 1){
                System.out.println("Er det skuddår? \n1. Ja \n2. Nei");
                int leapyear = in.nextInt();
                switch (leapyear){
                    case 1:
                        month[i] = 29;
                        break;
                    case 2:
                        month[i] = 28;
                        break;
                }
            }
            else {
                System.out.println("Hvor mange dager er det i måneden " + monthName[i] + "?");
                int days = in.nextInt();
                month[i] = days;
            }
        }

        for(int j=0; j<month.length; j++){
            System.out.println(monthName[j] + ": " + month[j]);
        }
        in.close();
    }
}
