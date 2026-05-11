package com.pluralsight;

public class Person {

    protected String name;
    protected int health;
    protected int experiencePoints;

    public Person(String name, int health, int experiencePoints) {
        this.name = name;
        this.health = health;
        this.experiencePoints = experiencePoints;
    }
    //interesting methods
    public boolean isAlive(){
        //return true if health is more than 0 and false if less or =
        return this.health > 0;
    }

    public String getStatus(){
        return this.name + " has " + this.health + " health";
    }




    //getters and setters
    //out of the way because the are not interesting
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    protected int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}
