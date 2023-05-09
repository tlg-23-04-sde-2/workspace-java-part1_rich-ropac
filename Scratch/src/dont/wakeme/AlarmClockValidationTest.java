package dont.wakeme;/*
 *  Application Test Class to verify correct behavior of our setter validation.
 *  BVT = Boundary Value Testing
 *  For a [1,20] range, you need to check:
 *  0,1  and 20,21
 */

class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);  //This should "stick" => 'clock' indeed has this value
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20);  //This should "stick" => 'clock' indeed has this value
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0);  //Error message, value not set, should still be the previous set value
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(21);  //Error message, value not set, should still be the previous set value
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

    }
}