package dont.wakeme;

/*
 * Class definition to model the workings of an alarm clock.
 * This is called a "business class" or "system class."
 * This class definition does NOT have a main() method - most classes don't.
 */
class AlarmClock {
    // class-level (shared) variables - these live in the shared/common area "above" the instance
    // these live in the shared/common area "above" the instances
    public static final int MIN_INTERVAL = 1;     // totally hidden - internal use only - no accessors
    public static final int MAX_INTERVAL = 20;    // totally hidden - internal use only - no accessors

    // properties or attributes - called "instance variables" or "fields" in Java
    private int snoozeInterval = 5;  // default value when client doesn't specify one;
    private int repeat = 1;          // default when client doesn't specify


    // constructors
    public AlarmClock(){
        // no operation; default used
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);       // delegate to setter for any validation/conversion
    }

    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval);                    // delegate to ctor above me for snoozeInterval
        setRepeat(repeat);
    }

    // functions or "methods" - what do AlarmClocks do?
    // business methods - these perform "business tasks" or operation
    public void snooze() {

        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");  //call your own getter
    }

    // accessor methods (get/set methods)- provide "controlled access" the object's fields
    public int getSnoozeInterval() {

        return snoozeInterval;
    }

    // Business constraint - must be between [1,20] inclusive
    public void setSnoozeInterval(int snoozeInterval) {
        if(snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {  // Valid
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval + ", " +
                    "must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL);

        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {
        return "Alarm Clock: snoozeInterval = " + getSnoozeInterval() + ", Repeat = " + getRepeat();
    }
}