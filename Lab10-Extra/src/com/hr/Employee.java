package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     * OPTION 4: try-catch and throw a different type of exception.
     * Instead of throwing the low-level "infrastructure" transportation exception,
     * we will throw a higher-level more suitable exception for our HR client.
     */
    public void goToWork() throws WorkException {
        Car c = new Car("TKE123", "Mercedes", "GLC");
        c.start();

        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);  // e is the nested 'cause'
        }
        finally {
            c.stop();
        }

        System.out.println(getName() + " arrived at work");
    }

    /*
     * OPTION 3: try-catch and "react in some way," then throw it back to my client.
     * This is sometimes called a catch-and-rethrow.
     */
    /* public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TKE123", "Mercedes", "GLC");
        c.start();

        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println("Send email to Lisa Herbold to complain");
            throw e;
        }
        finally {
            c.stop();
        }

        System.out.println(getName() + " arrived at work");
    }

     */



    /*
     *  OPTION 2: "punt", do not handle the exception
     * NOTE:  Since we don't handle it and it is checked, we have to say "throws"
     * Important that stop is called no matter what.
     *
     * We use a try-finally, which allows us to "punt" and still get the call to c.stop()
     * to always happen
     */

    /* public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TKE123", "Mercedes", "GLC");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        finally {
            c.stop();      //IMPORTANT that stop() is always called
        }
    }

     */

    /*
     *  OPTION 1:  try-catch and handle.
     *  NOTE that we use a "finally" block to ensure that stop() is always called:
     *  if exception is not thrown
     *  if exception is thrown
     */

    /*
    public void goToWork() {
        Car c = new Car("TKE123", "Mercedes", "GLC");
        c.start();

        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println(e);                     // toString() automatically called
            // System.out.println(e.getMessage());
        }
        finally {
            c.stop();
        }

        // System.out.println(getName() + " arrived at work");
    }
    */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}