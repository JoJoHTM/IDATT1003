package Oving7;

import java.util.Scanner;

public class NyStringClient {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a text to shorten: ");
        String text = in.nextLine();

        NyString nyString = new NyString(text);
        System.out.println(nyString.shorten());

        System.out.println("Which character do you want to remove from the text? ");
        String letter = in.nextLine();
        System.out.println(nyString.remove(letter));
    }
}
