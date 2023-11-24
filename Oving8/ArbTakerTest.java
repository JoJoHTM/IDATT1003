package Oving8;

import java.util.Scanner;

public class ArbTakerTest {
    public static void main(String[] args){
        Person person = new Person();
        ArbTaker arbTaker = new ArbTaker(person,2650, 2018, 25000, 25);
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Hei, hva ønsker du å gjøre?");
            System.out.println("1. Sjekke arbeider");
            System.out.println("2. Endre informasjon hos arbeider");
            System.out.println("3. Lukk program");
            int meny = in.nextInt();
            int endringInt;
            float endringFloat;
            if(meny == 1){
                printInfo(arbTaker);
            }
            else if(meny == 2){
                System.out.println("Hva ønsker du å endre?");
                System.out.println("1: ID nummer");
                System.out.println("2: Ansettelses år");
                System.out.println("3: Månedslønn");
                System.out.println("4: Skatteprosent");
                meny = in.nextInt();

                switch(meny) {
                    case 1:
                        System.out.println("Hva er det nye ID nummeret?");
                        endringInt = in.nextInt();
                        arbTaker.setArbTakerNr(endringInt);
                        break;
                    case 2:
                        System.out.println("Hva er det nye ansettelses året?");
                        endringInt = in.nextInt();
                        arbTaker.setStartOfEmployment(endringInt);
                        break;
                    case 3:
                        System.out.println("Hva er den nye månedslønnen?");
                        endringFloat = in.nextFloat();
                        arbTaker.setMonthlySalary(endringFloat);
                        break;
                    case 4:
                        System.out.println("Hva er den nye skatteprosenten?");
                        endringFloat = in.nextFloat();
                        arbTaker.setTaxPercent(endringFloat);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + meny);
                }
                printInfo(arbTaker);
            }
            else{
                System.out.println("Takk for i dag! :)");
                break;
            }
        }
        in.close();
    }

    private static void printInfo(ArbTaker arbTaker) {
        System.out.format("Navn: %s\n",arbTaker.getFullName());
        System.out.format("Alder: %d\n",arbTaker.getAge());
        System.out.format("ID nummer: %d\n",arbTaker.getArbTakerNr());
        System.out.format("Månedslønn: %.2f\n",arbTaker.getMonthlySalary());
        System.out.format("Skatteprosent: %.2f\n", arbTaker.getTaxPercent());
        System.out.format("Skatt per måned: %.2f\n", arbTaker.taxPerMonth());
        System.out.format("Skatt per år: %.2f\n", arbTaker.taxPerYear());
        System.out.format("Brutto lønn per år: %.2f\n",arbTaker.grossSalaryYear());
        System.out.format("Ansettelses år: %d\n",arbTaker.getStartOfEmployment());
        System.out.format("%s har vært ansatt i %d år\n",arbTaker.getFullName(),arbTaker.yearsInCompany());
    }
}
