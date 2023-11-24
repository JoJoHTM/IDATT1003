public class Arrangement {
    private int nummer;
    private String navn;
    private String sted;
    private String arrangør;
    private String type;
    private long tidspunkt;

    public Arrangement(int nummer, String navn, String sted, String arrangør, String type, long tidspunkt){
        this.nummer = nummer;
        this.navn = navn;
        this.sted = sted;
        this.arrangør = arrangør;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }

    public int getNummer(){ return nummer; }

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


}
