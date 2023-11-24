package Oving8;

import java.util.GregorianCalendar;

public class ArbTaker {
    private final Person personalia;

    private int arbTakerNr;

    private int startOfEmployment;

    private float monthlySalary;

    private float taxPercent;
    GregorianCalendar calendar = new GregorianCalendar();

    public ArbTaker(Person personalia, int arbTakerNr, int startOfEmployment, float monthlySalary, float taxPercent){
        this.personalia = personalia;
        this.arbTakerNr = arbTakerNr;
        this.startOfEmployment = startOfEmployment;
        this.monthlySalary = monthlySalary;
        this.taxPercent = taxPercent;
    }


    public int getArbTakerNr() {
        return arbTakerNr;
    }

    public void setArbTakerNr(int arbTakerNr) {
        this.arbTakerNr = arbTakerNr;
    }

    public int getStartOfEmployment() {
        return startOfEmployment;
    }

    public void setStartOfEmployment(int newStartOfEmployment) {
        this.startOfEmployment = newStartOfEmployment;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float salary) {
        this.monthlySalary = salary;
    }

    public float getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(float newTaxPercent) {
        this.taxPercent = newTaxPercent;
    }

    public float taxPerMonth(){
        return monthlySalary*taxPercent/100;
    }

    public float grossSalaryYear(){
        return monthlySalary*12;
    }

    public float taxPerYear(){
        //Juni er skattefri og desember betales halv skatt
        return taxPerMonth()*10 + taxPerMonth()*1/2;
    }

    public String getFullName(){
        return personalia.getLastname() + ", " + personalia.getFirstname();
    }

    public int getAge(){
        return calendar.get(java.util.Calendar.YEAR) - personalia.getBirthyear();
    }

    public int yearsInCompany(){
        return calendar.get(java.util.Calendar.YEAR) - startOfEmployment;
    }

    public String employedLongerThan(int year){
        if(yearsInCompany() > year){
            return String.format("Personen har vært ansatt i lenger enn %d år",year);
        }
        else{
            return String.format("Personen har ikke vær ansatt i lenger enn %d år",year);
        }
    }
}
