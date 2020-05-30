package com.company;

public class Animal {
    final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = 15.0;
                break;
            case "cat":
                this.weight = 10.0;
                break;
            case "myszojeleń":
                this.weight = 5.5;
                break;


        }
    }

    private boolean isAlive() {
        return this.weight > 0;
    }

    public void feed() {
        if (isAlive()) {
            this.weight++;
            System.out.println("Fed. Weight increased to " + this.weight + " kg");
        }
        else System.out.println("Call the shaman !!!");
    }

    public void takeForAWalk() {
        if (isAlive()) {
            this.weight--;
            System.out.println("Fitness" + this.weight + " kg");
        }
        else System.out.println("I'm not zombie i cant walk when i am dead");
    }

    public void Sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Yey new pet");
        } else {
            System.out.println("not enough cash");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
}
