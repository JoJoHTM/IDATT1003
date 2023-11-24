import java.util.ArrayList;
import java.util.Scanner;

public class ArrangementTest {
    public static void main(String[] args){
        ArrangementRegister arrangementRegister = new ArrangementRegister();
        Arrangement arrangement1 = new Arrangement(1, "Konsert i parken", "Parken", "Live Events AS", "Konsert", 202210301600L);
        Arrangement arrangement2 = new Arrangement(2, "Teaterforestilling", "Teaterhuset", "Dramatikkteateret", "Teater", 202310101600L);

        arrangementRegister.leggTilArrangement(arrangement1);
        arrangementRegister.leggTilArrangement(arrangement2);
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Velg en handling:");
            System.out.println("1. Legg til arrangement");
            System.out.println("2. Finn arrangementer på et gitt sted");
            System.out.println("3. Avslutt");

            String valg = in.nextLine();

            switch(valg){
                case "1":
                    System.out.println("Skriv inn arrangementnummer: ");
                    int nummer = in.nextInt();
                    in.nextLine();
                    System.out.println("Skriv inn arrangementnavn: ");
                    String navn = in.nextLine();
                    System.out.println("Skriv inn sted: ");
                    String sted = in.nextLine();
                    System.out.println("Skriv in arrangør: ");
                    String arrangør = in.nextLine();
                    System.out.println("Skriv inn type arrangement: ");
                    String typeArrangement = in.nextLine();
                    System.out.println("Skriv inn tidspunkt (12 siffer f.eks 200202111800 = 11 feb 2002 18:00)");
                    long tidspunkt = in.nextLong();
                    Arrangement arrangement = new Arrangement(nummer, navn, sted, arrangør, typeArrangement, tidspunkt);
                    arrangementRegister.leggTilArrangement(arrangement);
                    System.out.println("Arrangementet er lagt til.");
                    break;
                case "2":
                    System.out.println("Skriv in stedet du vil søke på: ");
                    String søkeSted = in.nextLine();
                    System.out.println(søkeSted);
                    ArrangementRegister arrangementerSted = arrangementRegister.finnArrangementerPåSted(søkeSted);
                    System.out.println(arrangementerSted);
                    break;
                case "3":
                    System.out.println("Avslutter programmet.");
                    in.close();
                    System.exit(0);
                    break;
            }

        }

    }
}
