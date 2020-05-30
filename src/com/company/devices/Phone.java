package com.company.devices;

import com.company.Human;
import java.net.URL;

public class Phone extends Device {


    public Phone(String manufacturer,String model,Integer yearOfProduction) {
        super(yearOfProduction, manufacturer, model);
    }

    static final String defaultAppServerName = "https://play.google.com/store/apps/details?id=pl.zabka.apb2c&hl=pl";
    static final String defaultAppServerProtocol = "https";
    static final String defaultAppServerVersion = "2.0.1";

    public void TurnOn(){
        System.out.println("Turn On Phone");
    }

    public void InstallApp(String appName) {}
    public void InstallApp(String appName, String appVersion) {}
    public void InstallApp(String appName, String appVersion, String serverServerAddress) {}
    public void InstallApp(String[] appNameList) {}
    public void InstallApp(URL appUrl) {}

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
