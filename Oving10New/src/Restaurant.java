import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        Rett rett1 = new Rett("Sushi", "Hovedrett", 221, "Rå fisk og ris");
        Rett rett2 = new Rett("Fried rice", "Hovedrett", 189, "Ris og eggerøre");
        Rett rett3 = new Rett("Garlic bread", "Forrett", 99, "Baguette, smør og hvitløk");

        MenyRegister menyRegister = new MenyRegister();


        menyRegister.registrerNyRett(rett1);
        menyRegister.registrerNyRett(rett2);
        menyRegister.registrerNyRett(rett3);


        Scanner in = new Scanner(System.in);

        while(true){
            tekstMeny();
            int valg = in.nextInt();
            in.nextLine();

            switch (valg){
                case 1:
                    System.out.println("Oppgi bæsj");
                    break;
                case 2:
                    System.out.println("Oppgi navn på retten");
                    String navnPåRett = in.nextLine();
                    System.out.println(menyRegister.finnRettNavn(navnPåRett));
                    break;
                case 3:
                    System.out.println("Oppgi hvilken type rett du søker");
                    String typeRett = in.nextLine();
                    System.out.println(menyRegister.finnRettType(typeRett));
                    break;
                case 4:
                    registrereMeny(in,menyRegister);
                    System.out.println(menyRegister.getMeny());
                    break;
                case 5:
                    System.out.println("Hva er nedre grense");
                    double lavestePris = in.nextDouble();
                    in.nextLine();
                    System.out.println("Hva er øverste grense");
                    double høyestePris = in.nextDouble();
                    in.nextLine();

                    System.out.println(menyRegister.finnMenyInnenforIntervall(lavestePris,høyestePris));
                    break;
                case 6:
                    System.out.println("Avslutter program");
                    in.close();
                    System.exit(0);
            }
        }
    }

    public static void tekstMeny(){
        System.out.println("Hva ønsker du å gjøre?");
        System.out.println("1. Registrere ny rett");
        System.out.println("2. Søke etter rett");
        System.out.println("3. Søke etter type");
        System.out.println("4. Vis menyer");
        System.out.println("5. Vis alle menyer der totalpris er innenfor et intervall");
        System.out.println("6. Avslutt");
    }

    public static void registrereMeny(Scanner in, MenyRegister menyRegister){
        System.out.println("Hva skal menyen hete ");
        String navn = in.nextLine();
        List<String>  navnPåRetter = new ArrayList<>();
        while(true){
            System.out.println("Hvilke rett ønsker du å legge til? (Skriv avslutt for å avslutte)");
            String svar = in.nextLine();
            if (svar.matches("avslutt")){
                break;
            }
            navnPåRetter.add(svar);
        }
        menyRegister.opprettMeny(navn,navnPåRetter);
    }
}
