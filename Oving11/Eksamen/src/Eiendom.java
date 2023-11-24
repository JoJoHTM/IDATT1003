/**
 * For denne klassen har vi valgt å bare implementere en (1)
 * setter metode for eierNavn. Dette er gjort siden de andre
 * feltene ikke gir mening å endre på, men navnet på eieren
 * av tomten kan godt endres.
 */
public class Eiendom {
    private final int kommuneNr;
    private final String kommuneNavn;
    private final int gårdsNr;
    private final int bruksNr;
    private String bruksNavn;
    private final double areal;
    private String eierNavn;

    public Eiendom(int kommuneNr, String kommuneNavn, int gårdsNr, int bruksNr, double areal, String eierNavn){
        this.kommuneNr = kommuneNr;
        this.kommuneNavn = kommuneNavn;
        this.gårdsNr = gårdsNr;
        this.bruksNr = bruksNr;
        this.areal = areal;
        this.eierNavn = eierNavn;
    }
    public Eiendom(int kommuneNr, String kommuneNavn, int gårdsNr, int bruksNr, String bruksNavn, double areal, String eierNavn) {
        this.kommuneNr = kommuneNr;
        this.kommuneNavn = kommuneNavn;
        this.gårdsNr = gårdsNr;
        this.bruksNr = bruksNr;
        this.bruksNavn = bruksNavn;
        this.areal = areal;
        this.eierNavn = eierNavn;
    }

    public int getGårdsNr() {
        return gårdsNr;
    }

    public double getAreal() {
        return areal;
    }

    public String getIdNr(){
        return kommuneNr + "-" + gårdsNr + "/" + bruksNr;
    }

    @Override
    public String toString() {
        return "Eiendom{" +
                "kommuneNr=" + kommuneNr +
                ", kommuneNavn='" + kommuneNavn + '\'' +
                ", gårdsNr=" + gårdsNr +
                ", bruksNr=" + bruksNr +
                ", bruksNavn='" + bruksNavn + '\'' +
                ", areal=" + areal +
                ", eierNavn='" + eierNavn + '\'' +
                '}';
    }
}
