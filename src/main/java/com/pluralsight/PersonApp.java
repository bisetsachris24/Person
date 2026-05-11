package com.pluralsight;

public class PersonApp {

    public static void main(String[] args) {

        Person somePerson = new Person("eric", 0, 100);
        SuperHuman someSuperHuman = new SuperHuman("Super Eric", 150, 200);
        Villain someVillian = new Villain("Evil Lovi", 500, 1000);

        //print out some info about each Person
        System.out.println(somePerson.getStatus());
        System.out.println(someSuperHuman.getStatus());
        System.out.println(someVillian.getStatus());
    }
}
