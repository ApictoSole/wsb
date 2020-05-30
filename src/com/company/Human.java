package com.company;

import com.company.devices.Phone;
import com.company.devices.Car;
import java.time.LocalDateTime;


public class Human {
    String firstName;
    String lastName;
    Animal pet;
    private Car vehicle;
    private Double salary;
    private LocalDateTime salaryLastAccessDateTime;
    private Double salaryLastAccessValue;
    public Double cash;
    public Phone telephone;

    public Human() {
        this.salary = 6550.0;
        this.salaryLastAccessDateTime = LocalDateTime.now();
        this.salaryLastAccessValue = this.salary;
    }

    public Double getSalary() {
        System.out.println("Last accessed on " + this.salaryLastAccessDateTime + ", it's value was " + salaryLastAccessValue);
        this.salaryLastAccessValue = this.salary;
        this.salaryLastAccessDateTime = LocalDateTime.now();
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be a negative value.");
        } else {
            System.out.println("change in payout");
            this.salary = salary;
        }
    }
    public  Double getCash() {
        return cash;
    }
    public void setCash(Double cash){
        this.cash = cash;
    }

   // public Car getVehicle() {
   //     return vehicle;
   // }
    public void getVehicle(Car acutalCar){
        this.vehicle = acutalCar;
    }
    public void unsetVehicle(){
        this.vehicle = null;
    }
    public Car getGetVehicle() {
        return vehicle;
    }
    public void setVehicle(Car newCar) {
        if (this.salary > newCar.price) {
            this.vehicle = newCar;
            System.out.println("You bought new car for cash");
        } else if (this.salary > (newCar.price / 12)) {
            this.vehicle = newCar;
            System.out.println("You got credit for this car ... RIP");
        } else {
            System.out.println("You can't afford it, better become a programmer");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", vehicle=" + vehicle +
                ", salary=" + salary +
                ", salaryLastAccessDateTime=" + salaryLastAccessDateTime +
                ", salaryLastAccessValue=" + salaryLastAccessValue +
                '}';
    }

}