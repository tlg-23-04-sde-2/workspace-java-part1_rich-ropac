package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // Instance Variable/Fields
    private double salary;

    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);    // delegate to superclass cotr for name, hireDate
        setSalary(salary);        // delegate to setter for any validation/conversion
    }

    // Business/Action Methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation(){
        System.out.println(getName() + " is on vacation.");
    }

    // Accessor Methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary = " + getSalary();
    }
}