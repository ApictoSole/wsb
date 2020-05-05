package com.company.devices;

public class Car {
    final String manufacturer;
    final String model;
    public Double price;
    Integer displacement;
    Integer enginePower;

    public Car(String manufacturer, String model, Integer displacement, Integer enginePower, Double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.displacement = displacement;
        this.enginePower = enginePower;
        this.price = price;

    }

}
