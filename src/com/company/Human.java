package com.company;

import com.company.devices.Car;
import java.time.LocalDateTime;


public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Car vehicle;
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
}
