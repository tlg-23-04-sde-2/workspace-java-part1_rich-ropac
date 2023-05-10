package net.StinkyService.client;

import net.StinkyService.CellPhone;
import net.StinkyService.CellPhoneBrand;

/*
 * Client-side main-class to create a few instances of CellPhone
 * and give them a basic text-drive.
 */
class CellPhoneClient {
    //Starting or Entry point
    public static void main(String[] args) {

        //Create an instance of a cellphone (a CellPhone object) and set its properties
        CellPhone cellPhone1 = new CellPhone(CellPhoneBrand.APPLE, "+1 (210) 248-8694",
                3.5, 10, true);

        //Create a second instance of a cellphone (a CellPhone object) and set its properties
        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setBrand(CellPhoneBrand.ANDROID);
        cellPhone2.setDevicePhoneNumber("+1 (405) 536-8645");
        cellPhone2.setScreenSizeInches(5.0);
        cellPhone2.setWeightOunces(8);
        cellPhone2.setSmart(true);

        //Create a third instance of a cellphone (a CellPhone object) and set its brand and phone number only
        CellPhone cellPhone3 = new CellPhone(CellPhoneBrand.SAMSUNG);

        //Place a Call
        cellPhone1.placeCall();

        //Send a Text
        cellPhone2.sendText();

        //Take a Picture
        cellPhone3.takePicture();

        //Create a Video
        cellPhone2.createVideo();

        //Print out the properties for each object
        System.out.println();
        System.out.println(cellPhone1);
        System.out.println(cellPhone2);
        System.out.println(cellPhone3);
    }
}