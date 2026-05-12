package com.pluralsight;

public class PersonApp {

    public static void main(String[] args) {

        SuperHuman someSuperHuman = new SuperHuman("Super Eric", 150, 200);
        Villain someVillain = new Villain("Evil Lovi", 500, 1000);

        System.out.println("A showdown begins between " + someSuperHuman.getName()
                + " and " + someVillain.getName() + "!");
        System.out.println(someSuperHuman.getStatus());
        System.out.println(someVillain.getStatus());
        System.out.println();

        // battle loop — keep fighting while both are alive
        while (someSuperHuman.isAlive() && someVillain.isAlive()) {

            // SuperHuman attacks the Villain
            int villainNewHealth = someVillain.getHealth() - someSuperHuman.getPowerLevel();
            someVillain.setHealth(villainNewHealth);
            System.out.println(someSuperHuman.getName() + " attacks " + someVillain.getName()
                    + " for " + someSuperHuman.getPowerLevel() + " damage!");
            System.out.println(someVillain.getStatus());


            // Villain attacks the SuperHuman
            int heroNewHealth = someSuperHuman.getHealth() - someVillain.getEvilnessLevel();
            someSuperHuman.setHealth(heroNewHealth);
            System.out.println(someVillain.getName() + " attacks " + someSuperHuman.getName()
                    + " for " + someVillain.getEvilnessLevel() + " damage!");
            System.out.println(someSuperHuman.getStatus());
            System.out.println();
        }
        while (someSuperHuman.isAlive() && someVillain.isAlive()) {
            someSuperHuman.attack(someVillain);
            System.out.println(someVillain.getStatus());

            if (!someVillain.isAlive()) break;

            someVillain.attack(someSuperHuman);
            System.out.println(someSuperHuman.getStatus());
            System.out.println();
        }

        // declare the winner
        System.out.println(" Showdown Over ");
        if (someSuperHuman.isAlive()) {
            System.out.println(someSuperHuman.getName() + " wins the showdown!");
        } else {
            System.out.println(someVillain.getName() + " wins the showdown!");
        }
        System.out.println();
        someSuperHuman.printBattleLog();
        someVillain.printBattleLog();
    }

}