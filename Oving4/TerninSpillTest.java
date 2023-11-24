package Oving4;
class TerningSpillTest{
    public static void main(String[] args){
        TerningSpill spiller1 = new TerningSpill(0);
        TerningSpill spiller2 = new TerningSpill(0);
        int iteration = 0;
        while((!spiller1.erFerdig()) && (!spiller2.erFerdig()) ){
            iteration += 1;
            if (iteration%2 != 0){
                spiller1.kastTerningen();
            }
            else{
                spiller2.kastTerningen();
            }
        }
        System.out.println("Runde " + iteration);
        if(iteration%2 != 0){
            System.out.println("Spiller 1 er vinneren \nSpiller 1: " + spiller1.getSumPoeng() + "\nSpiller 2: " + spiller2.getSumPoeng());
        }
        else{
            System.out.println("Spiller 2 er vinneren \nSpiller 2: " + spiller2.getSumPoeng() + "\nSpiller 1: " + spiller1.getSumPoeng());
        }
    }
}
