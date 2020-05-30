package com.company.devices;

public class Car extends Device {
    Integer displacement;
    Integer enginePower;
    public Double price;

    public Car(String manufacturer, String model, Integer yearOfProduction, Integer displacement, Integer enginePower, Double price) {
        super(yearOfProduction, manufacturer, model);
        //  this.manufacturer = manufacturer;
        //  this.model = model;
        this.displacement = displacement;
        this.enginePower = enginePower;
        this.price = price;

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