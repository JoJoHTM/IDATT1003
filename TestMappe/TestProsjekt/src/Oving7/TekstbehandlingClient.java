package Oving7;

import java.util.Scanner;

public class TekstbehandlingClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        Tekstbehandling user = new Tekstbehandling(text);

        System.out.format("There are %.2f words in the text\n",user.wordsInText());

        System.out.format("The average word length is %.2f\n",user.averageWordLength());

        System.out.format("The average words per period is %.2f\n", user.averageWordsPerPeriod());

        System.out.println("What word do you want to replace?");
        String oldWord = in.nextLine();
        System.out.println("And with what word?");
        String newWord = in.nextLine();
        System.out.println(user.replaceWord(oldWord,newWord));

        System.out.println(user.getText());

        System.out.println(user.getTextCapitalized());

    }
}
