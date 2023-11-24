package Oving7;

public class Tekstbehandling {
    private String text;
    private float wordLength;
    private String[] textList;

    public Tekstbehandling(String text){
        this.text = text;
    }

    public float wordsInText(){
        textList = text.split(" ");
        return textList.length;
    }

    public float averageWordLength(){

        for(int i=0; i<textList.length; i++){
            textList[i] = textList[i].replaceAll("[^a-zA-Z0-9æøåÆØÅ]","");
            wordLength += textList[i].length();
        }
        return wordLength / textList.length;
    }

    public float averageWordsPerPeriod(){
        String [] textListPeriod = text.split("[.!:?]+");
        return wordsInText() / textListPeriod.length;
    }

    public String replaceWord(String oldWord, String newWord){
        text = text.replaceAll(oldWord, newWord);
        return text;
    }

    public String getText(){
        return text;
    }

    public String getTextCapitalized(){
        return text.toUpperCase();
    }
}

