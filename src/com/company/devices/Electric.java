package com.company.devices;

public class Electric extends Car {
    public Electric(String manufacturer, String model, Integer yearOfProduction, Integer displacement, Integer enginePower, Double price) {
        super(manufacturer, model, yearOfProduction, displacement, enginePower, price);
    }

    public void Refuel() {
        System.out.println("I am eco");
    }
}
