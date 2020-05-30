package com.company.devices;

import com.company.Human;

public class Phone extends Device {


    public Phone(String manufacturer,String model,Integer yearOfProduction) {
        super(yearOfProduction, manufacturer, model);
    }

    public void TurnOn(){
        System.out.println("Turn On Phone");
    }

    public void Sell(Human seller, Human buyer, Double price) {
        if (buyer.getCash() >= price){
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.telephone = seller.telephone;
            seller.telephone = null;
            System.out.println("Phone was Sold");
        }
        else {
            System.out.println("not enough cash");
        }

    }

}
