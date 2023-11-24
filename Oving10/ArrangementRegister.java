import java.util.ArrayList;
import java.util.List;

public class ArrangementRegister {
    private List<Arrangement> arrangementer = new ArrayList<>();

    public void leggTilArrangement(Arrangement arrangement){
        if(doesNumberExist(arrangement.getNummer())){
            throw new IllegalArgumentException("Number has to be uniqe however the given number already exists in Register");
        }
        arrangementer.add(arrangement);
    }

    public ArrangementRegister finnArrangementerPåSted(String sted){
        ArrangementRegister resultater = new ArrangementRegister();
        for (Arrangement arrangement : arrangementer){
            if(arrangement.getSted().equals(sted)) {
                resultater.leggTilArrangement(arrangement);
            }
        }
        return resultater;
    }

    public boolean doesNumberExist(int number){
        for (Arrangement arrangement : arrangementer){
            if (arrangement.getNummer() == number){
                return true;
            }
        }
        return false;
    }
}
