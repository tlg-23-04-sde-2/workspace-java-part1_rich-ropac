/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1750.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 45.0, 20.0));
        dept.addEmployee(new SalariedEmployee("Preacher", LocalDate.of(2018,1,18), 1250.0));
        dept.addEmployee(new HourlyEmployee("James", LocalDate.of(2015,5,21), 30.0,40.0));
        dept.addEmployee(new Executive("Jay", LocalDate.of(2022,2,2), 250_000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay all employees
        System.out.println("\nPay employees:");
        dept.payEmployees();

        // forced holiday break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();
    }
}