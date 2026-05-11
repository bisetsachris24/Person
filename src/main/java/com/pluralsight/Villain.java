package com.pluralsight;

public class Villain extends Person {

    public Villain(String name, int health, int evliness) {
        super(name, health, evliness);
    }

    public int getEvilnessLevel(){
        return this.experiencePoints;
    }
}