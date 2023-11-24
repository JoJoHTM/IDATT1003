import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EiendomsRegister register = new EiendomsRegister();
        Eiendom eiendom1 = new Eiendom(1445, "Gloppen", 77, 631, 1017.6, "Jens Olsen");
        Eiendom eiendom2 = new Eiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        Eiendom eiendom3 = new Eiendom(1445, "Gloppen", 75, 19, "Fudletun", 650.6, "Evilyn Jensen");
        Eiendom eiendom4 = new Eiendom(1445, "Gloppen", 74, 188, 1457.2, "Karl Ove Bråten");
        Eiendom eiendom5 = new Eiendom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");

        register.registrerEiendom(eiendom1);
        register.registrerEiendom(eiendom2);
        register.registrerEiendom(eiendom3);
        register.registrerEiendom(eiendom4);
        register.registrerEiendom(eiendom5);

        Scanner in = new Scanner(System.in);
        while(true){
            meny();
            int valg = in.nextInt();
            in.nextLine();

            switch (valg) {
                case 1:
                    registrereEiendom(in, register);
                    break;
                case 2:
                    fjerneEiendom(in, register);
                    break;
                case 3:
                    System.out.println(register.antallEiendommer());
                    break;
                case 4:
                    System.out.println(register.getRegister());
                    break;
                case 5:
                    finnEiendom(in, register);
                    break;
                case 6:
                    System.out.println(register.gjennomsnittAreal());
                    break;
                case 7:
                    System.out.println("Oppgi gårdsnummer");
                    int gårdsNr = in.nextInt();
                    System.out.println(register.finnEiendommerPåGårdsNr(gårdsNr));
                    break;
                case 8:
                    System.out.println("Avslutter program");
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("Ugyldig svar, prøv igjen");
                    break;
            }
        }

    }

    private static void meny(){
        System.out.println("Hva ønsker du å gjøre?");
        System.out.println("1. Registrere ny eiendom");
        System.out.println("2. Fjerne eiendom");
        System.out.println("3. Se antall eiendommer registrert");
        System.out.println("4. Se gjennom hele registeret");
        System.out.println("5. Let etter eiendom");
        System.out.println("6. Gjennomsnitts areal av alle eiendommene");
        System.out.println("7. Finn eiendom basert på gårdsnummer");
        System.out.println("8. Avslutt");
    }

    private static void registrereEiendom(Scanner in, EiendomsRegister register){
        System.out.println("Kommune nummer: ");
        int kommuneNr = in.nextInt();
        in.nextLine();
        System.out.println("Kommune navn: ");
        String kommuneNavn = in.nextLine();
        System.out.println("Gårds nummer: ");
        int gårdsNr = in.nextInt();
        in.nextLine();
        System.out.println("Bruks nummer: ");
        int bruksNr = in.nextInt();
        in.nextLine();
        System.out.println("Bruks navn (Ikke nødvendig)");
        String bruksNavn = in.nextLine();
        System.out.println("Areal: ");
        double areal = in.nextDouble();
        in.nextLine();
        System.out.println("Navn på eier: ");
        String eier = in.nextLine();

        if (bruksNavn.matches("")){
            register.registrerEiendom(new Eiendom(kommuneNr, kommuneNavn, gårdsNr, bruksNr, areal, eier));
        }
        else {
            register.registrerEiendom(new Eiendom(kommuneNr, kommuneNavn, gårdsNr, bruksNr, bruksNavn ,areal, eier));
        }

        System.out.println("Ny eiendom registrert");
    }

    private static void fjerneEiendom(Scanner in, EiendomsRegister register){
        System.out.println("Kommune nummer: ");
        int kommuneNr = in.nextInt();
        System.out.println("Gårds nummer: ");
        int gårdsNr = in.nextInt();
        System.out.println("Bruks nummer: ");
        int bruksNr = in.nextInt();

        register.slettEiendom(kommuneNr, gårdsNr, bruksNr);
        System.out.println("Eiendommen er fjernet");
    }

    private static void finnEiendom(Scanner in, EiendomsRegister register){
        System.out.println("Kommune nummer: ");
        int kommuneNr = in.nextInt();
        System.out.println("Gårds nummer: ");
        int gårdsNr = in.nextInt();
        System.out.println("Bruks nummer: ");
        int bruksNr = in.nextInt();

        System.out.println(register.finnEiendom(kommuneNr, gårdsNr, bruksNr));
    }
}