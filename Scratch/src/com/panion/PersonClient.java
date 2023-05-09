package com.panion;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Rich", LocalDate.of(1962, 10, 2));
        System.out.println(p1);                  // toString() automatically called
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old." );
    }
}