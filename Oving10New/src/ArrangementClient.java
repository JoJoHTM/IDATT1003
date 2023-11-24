import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrangementClient {
    public static void main(String[] args) {
        ArrangementRegister register = new ArrangementRegister();

        Arrangement arrangement1 = new Arrangement(1, "Konsert i parken", "Parken", "Live Events AS", "Konsert", 202210301600L);
        Arrangement arrangement2 = new Arrangement(2, "Teaterforestilling", "Teaterhuset", "Dramatikkteateret", "Teater", 202310101600L);
        Arrangement arrangement3 = new Arrangement(3, "Idrettskonkurranse", "Idrettsarenaen", "Sportsforeningen", "Idrett", 202310281600L);
        Arrangement arrangement4 = new Arrangement(4, "Ballettopptreden", "Teaterhuset", "Ballettforeningen", "Dans", 202310241900L);
        Arrangement arrangement5 = new Arrangement(5, "Rockekonsert", "Rock Arena", "Live Events AS", "Konsert", 202310301600L);
        Arrangement arrangement6 = new Arrangement(6, "Jazzfestival", "Jazzklubben", "Musikkforeningen", "Musikkfestival", 202310101600L);

        register.nyttArrangement(arrangement2);
        register.nyttArrangement(arrangement1);
        register.nyttArrangement(arrangement3);
        register.nyttArrangement(arrangement4);
        register.nyttArrangement(arrangement5);
        register.nyttArrangement(arrangement6);

        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("1: Registrer et nytt arrangement");
            System.out.println("2: Finn alle arrangementer på ett gitt sted");
            System.out.println("3: Finn alle arrangementer på en gitt dato");
            System.out.println("4: Finn alle arrangementer mellom to datoer (yyyymmdd)");
            System.out.println("5: Sorter på sted");
            System.out.println("6: Sorter på tid");
            System.out.println("7: Sorter på type");
            System.out.println("8: Avslutt");

            int valg = in.nextInt();
            in.nextLine();

            switch (valg){
                case 1:
                    registrerNyttArrangement(register);
                    break;
                case 2:
                    System.out.println("Hvilket sted: ");
                    String sted = in.nextLine();

                    ArrangementRegister resultatSted = register.finnArrangementPåSted(sted);
                    System.out.println(resultatSted);
                    break;
                case 3:
                    System.out.println("Hvilken dato ønsker du å sjekke (yyyymmdd)");
                    String dato = in.nextLine();

                    ArrangementRegister resultatDato = register.finnArrangementPåDato(dato);
                    System.out.println(resultatDato);
                    break;
                case 4:
                    System.out.println("Start dato");
                    long startDato = in.nextLong();
                    System.out.println("Slutt dato");
                    long sluttDato = in.nextLong();

                    System.out.println(register.arrangementerITidsrom(startDato,sluttDato));
                    break;
                case 5:
                    System.out.println(register.sorterPåSted());
                    break;
                case 6:
                    System.out.println(register.sorterPåTid());
                    break;
                case 7:
                    System.out.println(register.sorterPåType());
                    break;
                case 8:
                    System.out.println("Avslutter programmet");
                    in.close();
                    System.exit(0);
                    break;
            }
        }
    }

    private static void registrerNyttArrangement(ArrangementRegister register){
        Scanner in = new Scanner(System.in);
        System.out.println("Nummer på arrangement: ");
        int nummer = in.nextInt();
        in.nextLine();
        System.out.println("Navn på arrangement: ");
        String navn = in.nextLine();
        System.out.println("Stedet til arrangementet: ");
        String sted = in.nextLine();
        System.out.println("Navn på arrangør: ");
        String arrangør = in.nextLine();
        System.out.println("Hva slags arrangement er det: ");
        String type = in.nextLine();
        System.out.println("Tidspunkt (f.eks 18:00 02. november 2000 = 200011021800): ");
        long tidspunkt = in.nextLong();
        Arrangement arrangement = new Arrangement(nummer, navn, sted, arrangør, type, tidspunkt);
        register.nyttArrangement(arrangement);
        System.out.println("Nytt arrangement er registrert");
    }
}