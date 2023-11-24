package Oving4;


public class TerningSpill {
    private int sumPoeng;
    public TerningSpill(int sumPoeng){
        this.sumPoeng = sumPoeng;
    }

    public int getSumPoeng() {
        return sumPoeng;
    }

    public void kastTerningen(){
        java.util.Random rnd = new java.util.Random();
        int terningKast = rnd.nextInt(6) + 1;

        if(terningKast == 1){
            sumPoeng = 0;
        }
        else{ 
            sumPoeng += terningKast;
        }
    }

    public boolean erFerdig(){
        if (sumPoeng >= 100) {
            return true;
        }
        else{
            return false;
        }
    }
}

