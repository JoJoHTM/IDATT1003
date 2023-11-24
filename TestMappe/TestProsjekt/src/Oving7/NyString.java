package Oving7;
import java.lang.String;
public class NyString {
    private final String text;
    public NyString(String text){
        this.text = text;
    }

    public String shorten(){
        String[] words = text.split(" ");
        StringBuilder shortenText = new StringBuilder();
        for (String word : words) {
            shortenText.append(word.charAt(0));
        }
        return shortenText.toString();
    }

    public String remove(String letter){
        return text.replace(letter, "");
    }
}
