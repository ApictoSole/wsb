package com.company.devices;

    public class Diesel extends Car{
        public Diesel(String manufacturer, String model, Integer yearOfProduction, Integer displacement, Integer enginePower, Double price) {
            super(manufacturer, model, yearOfProduction, displacement, enginePower, price);
        }

        public void Refuel() {
            System.out.println("KLE KLE KLE KLE KLE KLE");
        }
    }

