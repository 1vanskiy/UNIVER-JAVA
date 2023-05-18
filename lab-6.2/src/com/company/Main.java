package com.company;

public class Main {

    public static void main(String[] args) {

    TeslaModelX firstPerson = new TeslaModelX(2015, 1900.4, 450, 60000, 300);
    PersonLocation firstPersonLocation = new PersonLocation("Kyiv", 50.438063,30.543691 );
    PersonSecurity firstPersonSecurity = new PersonSecurity("admin123", "qwerty", "178.212.100.220");
    System.out.println(TeslaModelX.getMaxSpeed());

    }
}
