package com.company.devices;

public class LPG extends Car{
    public LPG(String manufacturer, String model, Integer yearOfProduction, Integer displacement, Integer enginePower, Double price) {
        super(manufacturer, model, yearOfProduction, displacement, enginePower, price);
    }

    public void Refuel() {
        System.out.println("LEPSZY POWER GAMONIU kickster sey that" );
    }
}
