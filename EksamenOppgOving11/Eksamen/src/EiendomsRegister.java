import java.util.ArrayList;
import java.util.List;

public class EiendomsRegister {
    private List<Eiendom> register = new ArrayList<>();

    public void registrerEiendom(Eiendom eiendom){
        register.add(eiendom);
    }

    public void slettEiendom(int kommuneNr, int gårdsNr, int bruksNr){
        register.removeIf(i -> i.getIdNr().matches(kommuneNr+"-"+gårdsNr+"/"+bruksNr));
    }

    public String finnEiendom(int kommuneNr, int gårdsNr, int bruksNr){
        for (Eiendom element : register){
            if (element.getIdNr().matches(kommuneNr+"-"+gårdsNr+"/"+bruksNr)){
                return element.toString();
            }
        }
        return "Kunne ikke finne eiendommen :(";
    }

    public int antallEiendommer(){
        return register.size();
    }

    public List<Eiendom> getRegister(){
        return register;
    }

    public double gjennomsnittAreal(){
        double resultat = 0;
        for (Eiendom element : register){
            resultat += element.getAreal();
        }
        resultat = resultat/register.size();
        return resultat;
    }

    public List<Eiendom> finnEiendommerPåGårdsNr(int gårdsNr){
        List<Eiendom> resultat = new ArrayList<>();
        for (Eiendom element : register){
            if (element.getGårdsNr() == gårdsNr){
                resultat.add(element);
            }
        }
        return resultat;
    }


    @Override
    public String toString() {
        return "EiendomsRegister{" +
                "register=" + register +
                '}';
    }
}
