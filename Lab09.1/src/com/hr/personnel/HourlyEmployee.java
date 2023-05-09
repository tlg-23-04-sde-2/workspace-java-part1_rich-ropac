package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee implements TaxPayer {
    private double rate;
    private double hours;


    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);  // delegate to superclass ctor for name, hireDate
        setRate(rate);          // delegate to setters for any validation/conversion
        setHours(hours);
    }

    // Business or Action Methods.  These perform business tasks
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of: " + (getRate() * getHours()) * HOURLY_TAX_RATE);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate = " + getRate() + ", hours = " + getHours();
    }
}