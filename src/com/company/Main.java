package com.company;

import com.company.devices.Car;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        Human me = new Human();

        me.firstName = "Bartosz";
        me.lastName = "Mazur";
        me.pet = new Animal("dog");
        Car shelbygt= new Car("Ford", "Mustang", 2130, 340, 230000.0);
        Car shelbygtbusted = new Car("Ford", "Mustang", 2130, 340, 230000.0);
        me.setVehicle(shelbygt);
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
        System.out.println("_ _ _ _ _");
        System.out.println(shelbygt == shelbygtbusted);
        System.out.println(shelbygt);
        System.out.println(shelbygtbusted);
        System.out.println(me.pet);
    }
}