package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {
    Integer displacement;
    Integer enginePower;
    public Double price;
    public abstract void Refuel();

    public Car(String manufacturer, String model, Integer yearOfProduction, Integer displacement, Integer enginePower, Double price) {
        super(yearOfProduction, manufacturer, model);
        //  this.manufacturer = manufacturer;
        //  this.model = model;
        this.displacement = displacement;
        this.enginePower = enginePower;
        this.price = price;

    }
    public void Sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.getVehicle(seller.getGetVehicle());
            seller.unsetVehicle();
            System.out.println("Car Sold!");
        } else {
            System.out.println("not enough cash.");
        }
    }

    @Override
    public void TurnOn() {
        System.out.println("Turn On Car");
    }

    @Override
    public String toString() {
        return "Car " + "displacement=" + displacement + "\n" +
                "Engine power " + enginePower + "\n" +
                "Price " + price + "\n" +
                "Manufacturer " + manufacturer + "\n" +
                "Model " + model + '\n' +
                "Year of production " + yearOfProduction + "\n";
    }
}