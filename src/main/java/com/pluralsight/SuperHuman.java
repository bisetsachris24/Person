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
    public void attack(Person target) {
        int newHealth = target.getHealth() - this.getPowerLevel();
        target.setHealth(newHealth);
        System.out.println(this.name + " attacks " + target.getName()
                + " for " + this.getPowerLevel() + " damage!");
    }

}