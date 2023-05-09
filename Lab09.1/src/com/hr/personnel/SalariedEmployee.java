package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee implements TaxPayer {
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

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of: " + (getSalary() * SALARIED_TAX_RATE));
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