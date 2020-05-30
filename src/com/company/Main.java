package com.company;

import com.company.devices.Car;
import java.time.format.DateTimeFormatter;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        Human me = new Human();

        me.firstName = "Bartosz";
        me.lastName = "Mazur";
        me.pet = new Animal("dog");
        Car shelbygt= new Car("Ford", "Mustang",2014, 2130, 340, 230000.0);
        Car shelbygtbusted = new Car("Ford", "Mustang",2014 , 2130, 340, 230000.0);
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


        Phone phone = new Phone("huiawei", "F20",2021);
        shelbygt.TurnOn();
        phone.TurnOn();
        System.out.println(shelbygt.toString());
        System.out.println(phone.toString());

        Human someoneElse = new Human();
        me.cash = 16000.0;
        someoneElse.cash = 17000.0;
        me.telephone = phone;
        me.getVehicle(shelbygt);
        me.pet.Sell(me, someoneElse, 1500.0);
        System.out.println("my cash " + me.cash + "\n" +
        "Someone Else cash " + someoneElse.cash + "\n");
        me.getGetVehicle().Sell(me, someoneElse, 14000.0);
        System.out.println("my cash " + me.cash + "\n" +
        "Someone Else cash " + someoneElse.cash + "\n");
        me.telephone.Sell(me, someoneElse, 1000.0);
        System.out.println("my cash " + me.cash + "\n" +
        "Someone Else cash " + someoneElse.cash + "\n");


    }
}