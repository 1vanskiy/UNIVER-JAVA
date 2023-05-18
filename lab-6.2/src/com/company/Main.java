package com.company;

public class Main {

    public static void main(String[] args) {

    Person firstPerson = new Person(18, 20, "Maks");
    PersonLocation firstPersonLocation = new PersonLocation("Kyiv", 50.438063,30.543691 );
    PersonSecurity firstPersonSecurity = new PersonSecurity("admin123", "qwerty", "178.212.100.220");
    System.out.println(firstPersonLocation.getСity());

    }
}
