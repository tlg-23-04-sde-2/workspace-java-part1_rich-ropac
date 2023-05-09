package net.StinkyService;/*
 *  This provides for exactly 5 instances of CellPhoneBrand even though there are more brands out there.
 *
 *  These are CellPhoneBrand objects, NOT Strings
 *
 *  They are referenced as:
 *    CellPhoneBrand.ANDROID...CellPhoneBrand.SAMSUNG  (5) total
 */

public enum CellPhoneBrand {
    ANDROID("Android"),
    APPLE("Apple"),
    GOOGLE("Google"),
    MOTOROLA("Motorola"),
    SAMSUNG("Samsung");

    private final String brand;

    CellPhoneBrand(String brand){
        this.brand = brand;
    }

    public String brand() {
        return brand;
    }

    public String toString(){
        return brand();
    }
}