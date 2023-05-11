package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee emp = new Employee("Rich");
        try {
            emp.goToWork();
        } catch (WorkException e) {
            System.out.println(e);
            // System.out.println(e.getMessage());
            // e.printStackTrace();
            // System.out.println(e.getCause());          // extract the nested cause (egg inside)
        }
    }
}