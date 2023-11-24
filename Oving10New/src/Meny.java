import java.util.ArrayList;
import java.util.List;

public class Meny {
    private List<Rett> retter = new ArrayList<>();
    private String navn;
    public Meny(String navn, List<Rett> retter){
        this.navn = navn;
        this.retter = retter;
    }

    public String getNavn(){ return navn; }

    public List<Rett> getRetter(){ return retter; }

    @Override
    public String toString() {
        return "Meny{" +
                "retter=" + retter +
                ", navn='" + navn + '\'' +
                '}';
    }
}
