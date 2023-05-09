package com.entertainment.client;/*
 *  Testing the constraints for Volume levels and Brands
 */

import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args) {

        Television tv = new Television();

        tv.setVolume(0);                                       // should stick
        System.out.println("Volume: " + tv.getVolume());       // should be 0

        tv.setVolume(100);                                     // should stick
        System.out.println("Volume: " + tv.getVolume());       // should be 100

        tv.setVolume(-1);                                      // should not stick, error message
        tv.setVolume(101);                                     // should not stick, error message
        System.out.println("Volume: " + tv.getVolume());       // should still be 100 from before

        System.out.println();

        tv.setBrand("Samsung");                                // should stick
        System.out.println("Brand: " + tv.getBrand());         // should be Samsung

        tv.setBrand("Sony");                                   // should stick
        System.out.println("Brand: " + tv.getBrand());         // should be Samsung

        tv.setBrand("Toshiba");                                // should stick
        System.out.println("Brand: " + tv.getBrand());         // should be Samsung

        tv.setBrand("LG");                                     // should stick
        System.out.println("Brand: " + tv.getBrand());         // should be Samsung

        tv.setBrand("Generic");                                // should stick
        System.out.println("Brand: " + tv.getBrand());         // should be Samsung




    }

}