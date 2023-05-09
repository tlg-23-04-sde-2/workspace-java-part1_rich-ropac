package net.StinkyService.client;

import net.StinkyService.CellPhone;
import net.StinkyService.CellPhoneBrand;

import java.util.Arrays;

class CellPhoneClientArgs {
    // check for the two required inputs, brand and phoneNumber
    public static void main(String[] args) {

        // two minimum input not met
        if (args.length < 2) {
            String errorMsgLine1 = "You did not enter the minimum input required: <brand> and <devicePhoneNumber>";
            String errorMsgLine2 = "Example: CellPhoneClientArgs 'Apple' and '+1 (210) 248-8694'";
            String errorMsgLine3 = "There are only 5 accepted cell phone brands for input and they are: "
                    + Arrays.toString(CellPhoneBrand.values());

            // Print out the error message
            System.out.println(errorMsgLine1);
            System.out.println(errorMsgLine2);
            System.out.println(errorMsgLine3);
        }
        // minimum input met
        else {
            //convert the arguments into proper types
            CellPhoneBrand brand = CellPhoneBrand.valueOf(args[0].toUpperCase());
            String phoneNumber = args[1];

            //create a new cell phone object
            CellPhone cellPhone = new CellPhone(brand, phoneNumber);

            String successMsgLine1 = "You entered " + args.length + " arguments.";
            String successMsgLine2 = "Your entry has been registered as " + cellPhone;

            System.out.println(successMsgLine1);
            System.out.println(successMsgLine2);
        }
    }
}