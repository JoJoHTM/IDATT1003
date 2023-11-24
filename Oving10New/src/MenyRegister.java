import java.util.ArrayList;
import java.util.List;

public class MenyRegister {
    private List<Meny> menyRegister = new ArrayList<>();
    private List<Rett> rettRegister = new ArrayList<>();

    public void registrerNyRett(Rett nyRett){
        if (eksistererRett(nyRett.getNavn())){
            throw new IllegalArgumentException("Retten eksisterer allerede");
        }
        rettRegister.add(nyRett);
    }


    public List<Rett> finnRettNavn(String navn){
        List<Rett> resultat = new ArrayList<>();
        for (Rett element : rettRegister) {
            if (element.getNavn().matches(navn)){
                resultat.add(element);
            }
        }
        return resultat;
    }

    public List<Rett> finnRettType(String type){
        List<Rett> resultat = new ArrayList<>();
        for (Rett element : rettRegister) {
            if (element.getType().matches(type)){
                resultat.add(element);
            }
        }
        return resultat;
    }

    public void opprettMeny(String navn, List<String> navnPåRetter){
        List<Rett> retter = new ArrayList<>();
        for (Rett element : rettRegister){
            for (String listeElement : navnPåRetter){
                if (element.getNavn().matches(listeElement)){
                    retter.add(element);
                }
            }
        }

        Meny meny = new Meny(navn,retter);
        menyRegister.add(meny);
    }

    public List<Meny> getMeny(){
        return menyRegister;
    }


    public List<String> finnMenyInnenforIntervall(double lavestePris, double høyestePris){
        List<String> menyInnenforIntervall = new ArrayList<>();

        for (Meny element : menyRegister) {
            double totalPris = 0;

            for (Rett rett : element.getRetter()){
                totalPris += rett.getPris();
            }

            if ((totalPris >= lavestePris) && (totalPris <= høyestePris)){
                menyInnenforIntervall.add(element.getNavn());
            }
        }

        return menyInnenforIntervall;
    }

    public boolean eksistererRett(String rett){
        for (Rett element : rettRegister) {
            if(element.getNavn().matches(rett)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MenyRegister{" +
                "menyRegister=" + menyRegister +
                ", rettRegister=" + rettRegister +
                '}';
    }
}
