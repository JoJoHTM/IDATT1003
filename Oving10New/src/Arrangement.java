public class Arrangement{

    private final int nummer;
    private final String navn;
    private final String sted;
    private final String arrangør;
    private final String type;
    private final long tidspunkt;

    public Arrangement(int nummer, String navn, String sted, String arrangør, String type, long tidspunkt){
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangør = arrangør;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    public int getNummer() {
        return nummer;
    }

    public String getNavn() {
        return navn;
    }
    public String getSted() {
        return sted;
    }

    public String getArrangør() {
        return arrangør;
    }

    public String getType() {
        return type;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }

    @Override
    public String toString() {
        return String.format("Arrangement nummer: %d   Navn: %s   Sted: %s   Arrangør: %s   Type: %s   Tidspunkt: %s",
                nummer, navn, sted, arrangør, type, tidspunkt);
    }
}
