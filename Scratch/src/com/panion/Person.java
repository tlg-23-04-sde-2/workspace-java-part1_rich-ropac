package com.panion;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class.
 * More accurately, it's a class definition written in such a way that
 * instance of it (Person objects) can't have their properties changed.
 *
 * In the code, this simply  means no public setters.
 */
class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
         this.name = name;
         this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    /*
     *  Returns the person's age in whole years
     */

    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Person: name = " + getName() +
                ", birthDate = " + getBirthDate();

    }
}