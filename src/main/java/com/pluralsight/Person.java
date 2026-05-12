package com.pluralsight;

import java.util.HashMap;

public class Person {

    protected String name;
    protected int health;
    protected int experiencePoints;
    private HashMap<String, Integer> battleLog = new HashMap<>();

    public Person(String name, int health, int experiencePoints) {
        this.name = name;
        this.health = health;
        this.experiencePoints = experiencePoints;
    }

    public boolean isAlive(){
        return this.health > 0;
    }

    public String getStatus(){
        return this.name + " has " + this.health + " health";
    }

    // update the log entry for this Person
    public void logHit(Person opponent) {
        String name = opponent.name;
        int count = battleLog.getOrDefault(name, 0);
        battleLog.put(name, count + 1);
    }

    // print the battle log for this Person
    public void printBattleLog() {
        System.out.println("Battle log for " + name + ":");
        for (HashMap.Entry<String, Integer> entry : battleLog.entrySet()) {
            System.out.println(" - Hit " + entry.getKey() + ": " + entry.getValue() + " times");
        }
    }

    // getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    protected int getExperiencePoints() { return experiencePoints; }
    public void setExperiencePoints(int experiencePoints) { this.experiencePoints = experiencePoints; }
}