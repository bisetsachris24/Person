package com.pluralsight;

public class SuperHuman extends Person {

    public SuperHuman(String name, int health, int powerLevel) {
        //when we create a super hero
        //the parent class already knows how to deal with
        //name, health, and experiencePoints
        //so we use super to call the parent constructor
        super(name, health, powerLevel);

    }

    public int getPowerLevel(){
        return this.experiencePoints;
    }

}