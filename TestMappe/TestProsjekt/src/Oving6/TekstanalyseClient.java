package Oving6;

import java.util.Arrays;
import java.util.Scanner;

public class TekstanalyseClient {
    public static void main(String[] args){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
                             "u","v","w","x","y","z","æ","ø","å","Other"};
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        Tekstanalyse user = new Tekstanalyse(text);
        int[] l = user.fillArray();
        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(l));

        int letters = user.amountOfLetters();
        double nonLetters = user.percentNonLetters();

        System.out.format("Amount of letters in the text is %d\n", letters);
        System.out.format("The percentage of nonletters is %.2f\n",nonLetters);

        System.out.println("What character do you want to check? ");
        String character = in.nextLine();
        int occurance = user.findCharacter(character);
        System.out.format("The letter %s occurs a number of %d times\n",character,occurance);

        String occursMostOften = user.forekommerOftest();
        System.out.format("The letter(s) that appear the most amount of times is %s",occursMostOften);
    }
}
