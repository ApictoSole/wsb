package com.company.devices;

public class Phone extends Device {


    public Phone(String manufacturer,String model,Integer yearOfProduction) {
        super(yearOfProduction, manufacturer, model);
    }

    public void TurnOn(){
        System.out.println("Turn On Phone");
    }

}
