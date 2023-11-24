package Oving4;

public class ValutaClass {
    private double rate;
    private String name;

    public ValutaClass(String name, double rate){
        this.rate = rate;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getRate(){
        return rate;
    }

    public double fromNOK(double money){
        return money/rate;
    }

    public double toNOK(double money){
        return money*rate;
    }
}
