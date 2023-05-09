package net.StinkyService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * Business class (system class) to model the properties of a cell phone.
 */
public class CellPhone {

    // CLASS (static) VARIABLES - shared among all instances
    public static final double MIN_SCREENSIZE = 3.5;       // Minimum screen size constraint for cell phone
    public static final double MAX_SCREENSIZE = 8.0;       // Maximum screen size constraint for cell phone
    public static final int MIN_WEIGHT = 3;                // Minimum weight (ounces) constraint for cell phone
    public static final int MAX_WEIGHT = 10;               // Maximum weight (ounces) constraint for cell phone

    // Instance Variables or Fields (Properties or Attributes)
    private CellPhoneBrand brand;       // Brand Name
    private String devicePhoneNumber;   // Device Phone Number
    private double screenSizeInches;    // Device Screen Size in Inches; Constraints are 3.5 to 8.0 inches
    private int weightOunces;           // Device Weight in Ounces; Constraints are 3 to 10 ounces
    private boolean isSmart;            // Is Device a Smart Device

    // Constructors
    public CellPhone() {

        // No Operation
    }

    public CellPhone(CellPhoneBrand brand) {
        setBrand(brand);
    }

    public CellPhone(CellPhoneBrand brand, String devicePhoneNumber) {
        this(brand);
        setDevicePhoneNumber(devicePhoneNumber);
    }

    public CellPhone(CellPhoneBrand brand, String devicePhoneNumber, double screenSizeInches, int weightOunces, boolean isSmart) {
        this(brand, devicePhoneNumber);
        setScreenSizeInches(screenSizeInches);
        setWeightOunces(weightOunces);
        setSmart(isSmart);
    }

    // BUSINESS METHODS (functions)

    public void placeCall() {
        System.out.println();
        System.out.println("Your " + brand + " device, number: " + devicePhoneNumber + " placed a call on "
          + LocalDate.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy")) + " at " //Date Stamp (Could store in var)
          + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) + ".");   //Time Stamp (Could store in var)
    }
    public void sendText() {
        System.out.println();
        System.out.println("Your " + brand + " device, number: " + devicePhoneNumber + " sent a text on "
          + LocalDate.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy")) + " at " //Date Stamp (Could store in var)
          + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) + ".");   //Time Stamp (Could store in var)
    }
    public void takePicture() {
        System.out.println();
        System.out.println("Your " + brand + " Device has taken a photo with its " + screenSizeInches + " inch screen on "
          + LocalDate.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy")) + " at " //Date Stamp (Could store in var)
          + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) + ".");   //Time Stamp (Could store in var)
    }
    public void createVideo() {
        System.out.println();
        System.out.println("Your " + brand + " Device has created a video with its " + screenSizeInches + " inch screen on "
          + LocalDate.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy")) + " at " //Date Stamp (Could store in var)
          + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) + ".");   //Time Stamp (Could store in var)
    }

    // ACCESSOR METHODS

    public CellPhoneBrand getBrand() {
        return brand;
    }

    public void setBrand(CellPhoneBrand brand) {
        this.brand = brand;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(double screenSizeInches) {
        if (screenSizeInches >= MIN_SCREENSIZE && screenSizeInches <= MAX_SCREENSIZE) {
            this.screenSizeInches = screenSizeInches;  //input is within the constraints so set the screen size
        }
        else {
            System.out.println("The screen size must be from " + MIN_SCREENSIZE + " to "
                    + MAX_SCREENSIZE + " inches." + " You entered: " + screenSizeInches);  //not valid, retain default
        }
    }

    public int getWeightOunces() {
        return weightOunces;
    }

    public void setWeightOunces(int weightOunces) {
        if (weightOunces >= MIN_WEIGHT && weightOunces <= MAX_WEIGHT) {
            this.weightOunces = weightOunces;  //input is within the constraints so set the weight
        }
        else {
            System.out.println("The weight must be from " + MIN_WEIGHT + " to "
                    + MAX_WEIGHT + " ounces." + " You entered: " + weightOunces);  //not valid, retain default
        }
    }

    public boolean getIsSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public String getDevicePhoneNumber() {
        return devicePhoneNumber;
    }

    public void setDevicePhoneNumber(String devicePhoneNumber) {
        this.devicePhoneNumber = devicePhoneNumber;
    }

    //toString()
    public String toString() {
        return "CellphoneBrand: " + getBrand() + ", Phone Number: " + getDevicePhoneNumber() +
               ", Screen Size = " + getScreenSizeInches() +
        " Inches, Weight: " + getWeightOunces() + " Ounces, Smart Phone: " + getIsSmart();
    }
}
