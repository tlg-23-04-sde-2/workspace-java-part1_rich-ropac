package net.StinkyService.test;/*
 *  Validation testing for the constraints (MIN and MAX values) set in 'CellPhone.java'
 *  for screenSizeInches and weightOunces
 */

import net.StinkyService.CellPhone;

class CellPhoneValidationTest {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();

        cellPhone.setScreenSizeInches(3.5);                                       // should stick
        System.out.println("Screen size: " + cellPhone.getScreenSizeInches());    // should be 3.5

        cellPhone.setScreenSizeInches(8.0);                                       // should stick
        System.out.println("Screen size: " + cellPhone.getScreenSizeInches());    // should be 8.0

        cellPhone.setScreenSizeInches(3.4);                                       // should not stick, error message
        System.out.println("Screen size: " + cellPhone.getScreenSizeInches());    // should still be 8.0 from before

        cellPhone.setScreenSizeInches(8.1);                                       // should not stick, error message
        System.out.println("Screen size: " + cellPhone.getScreenSizeInches());    // should still be 8.0 from before

        System.out.println();                                               // print blank line

        cellPhone.setWeightOunces(3);                                       // should stick
        System.out.println("Weight: " + cellPhone.getWeightOunces());       // should be 3

        cellPhone.setWeightOunces(10);                                      // should stick
        System.out.println("Weight: " + cellPhone.getWeightOunces());       // should be 8.0

        cellPhone.setWeightOunces(2);                                       // should not stick, error message
        System.out.println("Weight: " + cellPhone.getWeightOunces());       // should still be 10 from before

        cellPhone.setWeightOunces(11);                                      // should not stick, error message
        System.out.println("Weight: " + cellPhone.getWeightOunces());       // should still be 10 from before

    }
}