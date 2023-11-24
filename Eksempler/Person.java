package Eksempler;

import java.time.Year;

public class Person {
    private String firstName;
    private String lastName;
    private String yearOfBirth;
    private String address;

    public Person(String firstName, String lastName, String yearOfBirth, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getYearOfBirth(){
        return yearOfBirth;
    }

    public String getAddress(){
        return address;
    }

    public int getAge(){
        int year = Year.now().getValue();
        int age = year - Integer.parseInt(yearOfBirth);
        return age;
    }
}



class LoveCalculatorTest{
    public static void main(String[] args){
        Person ola = new Person("Ola","Nordmann","1997","Rugdevegen");
        int personAge = ola.getAge(); 
        System.out.println(personAge);
    }
}

