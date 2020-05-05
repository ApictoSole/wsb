package com.company;

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

    public Human() {
        this.salary = 2450.0;
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
    public Car getVehicle() {
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
}
