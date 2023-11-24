
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ArrangementRegister {
    private List<Arrangement> arrangementer = new ArrayList<>();

    public void nyttArrangement(Arrangement nyArrangement){
        if(doesNumberExist(nyArrangement.getNummer())){
            throw new IllegalArgumentException("Number must be unique");
        }
        arrangementer.add(nyArrangement);
    }

    public ArrangementRegister finnArrangementPåSted(String sted){
        ArrangementRegister resultat = new ArrangementRegister();

        for (Arrangement arrangement : arrangementer) {
            if(arrangement.getSted().equals(sted)) {
                resultat.nyttArrangement(arrangement);
            }
        }
        return resultat;
    }

    public ArrangementRegister finnArrangementPåDato(String dato){
        ArrangementRegister resultat = new ArrangementRegister();

        for(Arrangement arrangement : arrangementer){
            String arrangementDato = String.valueOf(arrangement.getTidspunkt());
            arrangementDato = arrangementDato.substring(0,8);
            if(arrangementDato.equals(dato)){
                resultat.nyttArrangement(arrangement);
            }
        }
        return resultat;
    }

    public ArrangementRegister arrangementerITidsrom(long start, long slutt){
        ArrangementRegister resultat = new ArrangementRegister();
        for (Arrangement arrangement : arrangementer) {
            if ((arrangement.getTidspunkt()/10000 >= start) & (arrangement.getTidspunkt()/10000 <= slutt)) {
                resultat.nyttArrangement(arrangement);
            }
        }
        resultat.sorterPåTid();
        return resultat;
    }

    public ArrangementRegister sorterPåSted(){
        ArrangementRegister sortertRegister = new ArrangementRegister();
        List<Arrangement> sortertArrangementer = new ArrayList<>(arrangementer);


        Collections.sort(sortertArrangementer, new Comparator<Arrangement>() {
            @Override
            public int compare(Arrangement a1, Arrangement a2){
                return a1.getSted().compareTo(a2.getSted());
            }
        });

        sortertRegister.arrangementer = sortertArrangementer;
        return sortertRegister;
    }

    public ArrangementRegister sorterPåType(){
        ArrangementRegister sortertRegister = new ArrangementRegister();
        List<Arrangement> sortertArrangementer = new ArrayList<>(arrangementer);

        Collections.sort(sortertArrangementer, new Comparator<Arrangement>() {
            @Override
            public int compare(Arrangement a1, Arrangement a2) {
                return a1.getType().compareTo(a2.getType());
            }
        });

        sortertRegister.arrangementer = sortertArrangementer;
        return sortertRegister;
    }

    public ArrangementRegister sorterPåTid(){
        ArrangementRegister sortertRegister = new ArrangementRegister();
        List<Arrangement> sortertArrangementer = new ArrayList<>(arrangementer);

        Collections.sort(sortertArrangementer, new Comparator<Arrangement>() {
            @Override
            public int compare(Arrangement a1, Arrangement a2) {
                return Long.compare(a1.getTidspunkt(), a2.getTidspunkt());
            }
        });

        sortertRegister.arrangementer = sortertArrangementer;
        return sortertRegister;
    }
    public boolean doesNumberExist(int number){
        for (Arrangement arrangement : arrangementer){
            if (arrangement.getNummer() == number){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Arrangementer: \n");
        for (Arrangement arrangement : arrangementer){
            output.append(arrangement.toString()).append("\n");
        }
        return output.toString();
    }

}
