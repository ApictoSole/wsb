package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    public void BeEaten() {
        System.out.println("Can be eaten");
    }

}
