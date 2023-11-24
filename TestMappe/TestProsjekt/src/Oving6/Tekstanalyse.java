package Oving6;

public class Tekstanalyse {
    private int[] antallTegn = new int[30];
    private String tekst;
    public Tekstanalyse(String tekst){
        this.tekst = tekst;
    }
    
    public int[] fillArray(){
        for(int i=0; i<tekst.length(); i++){
            char letter = tekst.toLowerCase().charAt(i);
            if((letter <= 'z') && (letter >= 'a')){
                antallTegn[letter-'a']++;
            }
            else if(letter == 'æ'){
                antallTegn[26]++;
            }
            else if(letter == 'ø'){
                antallTegn[27]++;
            }
            else if(letter == 'å'){
                antallTegn[28]++;
            }
            else{
            antallTegn[29]++;
            }
        }
        return antallTegn;
    }
    
    public int amountOfLetters(){
        int letters = 0;
        for(int i=0; i<antallTegn.length-1; i++){
            letters += antallTegn[i];
        }
        return letters;
    }

    public double percentNonLetters(){
        double totalCharacters = 0;
        for(int i=0; i<antallTegn.length; i++){
            totalCharacters += antallTegn[i];
        }
        return antallTegn[29]/totalCharacters*100;
    }

    public int findCharacter(String character){
        int valueOfCharacter = character.toLowerCase().charAt(0);
        if((valueOfCharacter <= 122) && (valueOfCharacter >= 97)){
            return antallTegn[valueOfCharacter-97];
        }
        else if(valueOfCharacter == 230){
            return antallTegn[26];
        }
        else if(valueOfCharacter == 248){
            return antallTegn[27];
        }
        else if(valueOfCharacter == 229){
            return antallTegn[28];
        }
        else{
            return antallTegn[29];
        }
    }

    public String forekommerOftest(){
        StringBuilder reocurring = new StringBuilder();
        int highestNumber = -1;
        for(int i=0; i<antallTegn.length; i++){
            if (highestNumber<antallTegn[i]){
                highestNumber = antallTegn[i];
                if(i<26){
                    reocurring = new StringBuilder("" + (char) (i + 'a'));
                }
                else if(i == 26) {
                    reocurring = new StringBuilder("æ");
                }
                else if(i == 27){
                    reocurring = new StringBuilder("ø");
                }
                else if(i == 28){
                    reocurring = new StringBuilder("å");
                }
            }
            else if(highestNumber == antallTegn[i]) {
                if (i < 26) {
                    reocurring.append("-").append((char) (i + 'a'));
                }
                else if(i == 26){
                    reocurring.append("-æ");
                }
                else if(i == 27){
                    reocurring.append("-ø");
                }
                else if(i == 28){
                    reocurring.append("-å");
                }
            }
        }
        return reocurring.toString();
    }
}

