/*
 * Client-side main-class to create a few instances of Television
 * and give them a basic text-drive.
 */
class TelevisionClient {

    //Starting or Entry point
    public static void main(String[] args) {

        //Create an instance of a Television (a Television object) and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Generic");
        tv1.setVolume(Television.MAX_VOLUME);
        tv1.setDisplay(DisplayType.PLASMA);

        //Create a second instance of a Television (a Television object) and set its properties
        Television tv2 = new Television("Samsung", Television.MIN_VOLUME, DisplayType.LCD);

        //Create a third instance of a Television (a Television object) and set its properties
        Television tv3 = new Television("LG", 10);

        //Turn television on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        //Turn television off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

        // System.out.println(tv1.toString());
        System.out.println(tv1);
        // System.out.println(tv2.toString());
        System.out.println(tv2);
        // System.out.println(tv3.toString());
        System.out.println(tv3);
        // Print out the total number of instances created
        System.out.println(Television.getInstanceCount() + " instances");
    }
}