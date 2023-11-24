package Oving4;
import java.util.Scanner;

/* 25.2 USD = 269.388 NOK
 * 21 euro = 240.87 NOK
 * 120.43 SVK = 115.6128 NOK
*/


public class ValutaTest {
    public static void main(String[] args){

        ValutaClass usd = new ValutaClass("Dollars", 10.74);
        ValutaClass euro = new ValutaClass("Euro", 11.49);
        ValutaClass svenskeKroner = new ValutaClass("Svenske Kroner", 0.9655);

        Scanner in = new Scanner(System.in);
        System.out.println("Velg valuta \n1: Dollar \n2: Euro \n3: Svenske kroner \n4: Avslutt");
        int choice = in.nextInt();
        double answerAmount = 0;
        while(choice != 4){

            System.out.println("Til eller fra NOK? \n1: Til NOK \n2: Fra NOK");
            int toOrFrom = in.nextInt();
            System.out.println("Hvor mye? ");
            double money = in.nextDouble();
            switch(choice){
                case 1:
                    if(toOrFrom == 1){
                        answerAmount = usd.toNOK(money);
                    }
                    else{
                        answerAmount = usd.fromNOK(money);
                    }
                    break;
                case 2:
                    if(toOrFrom == 1){
                        answerAmount = euro.toNOK(money);
                    }
                    else{
                        answerAmount = euro.fromNOK(money);
                    }
                    break;
                case 3:
                    if(toOrFrom == 1){
                        answerAmount = usd.toNOK(money);
                    }
                    else{
                        answerAmount = svenskeKroner.fromNOK(money);
                    }
                    break;
                case 4:
                    break;
            }
            System.out.println(answerAmount);
            System.out.println("Velg valuta \n1: Dollar \n2: Euro \n3: Svenske kroner \n4: Avslutt");
            choice = in.nextInt();
        }
        in.close();
    }
}

