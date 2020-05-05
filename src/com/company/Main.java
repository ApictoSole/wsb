package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();

        me.firstName = "Bartosz";
        me.lastName = "Mazur";
        me.pet = new Animal("dog");
        me.vehicle = new Car("Ford", "Mustang", 2130, 340);
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
    }
}