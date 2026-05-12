package com.pluralsight;

public class Villain extends Person {

    public Villain(String name, int health, int evliness) {
        super(name, health, evliness);
    }

    public int getEvilnessLevel(){
        return this.experiencePoints;
    }
    public void attack(Person target) {
        int newHealth = target.getHealth() - this.getEvilnessLevel();
        target.setHealth(newHealth);
        System.out.println(this.name + " attacks " + target.getName()
                + " for " + this.getEvilnessLevel() + " damage!");
        this.logHit(target);
    }
}