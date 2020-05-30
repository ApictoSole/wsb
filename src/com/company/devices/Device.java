package com.company.devices;

public abstract class Device {
    final Integer yearOfProduction;
    final String manufacturer;
    final String model;

    protected Device(Integer yearOfProduction, String manufacturer, String model) {
        this.yearOfProduction = yearOfProduction;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    abstract void TurnOn();

    @Override
    public String toString() {
        return "manufacturer" + manufacturer + " " + " model -> " + model + "year of production " + yearOfProduction;
    };


}
