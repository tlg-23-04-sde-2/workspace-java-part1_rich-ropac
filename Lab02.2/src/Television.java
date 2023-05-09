/*
 * Business class (system class) to model the workings of a television.
 */
class Television {

    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;

    public static int getInstanceCount() {

        return instanceCount;
    }

    // instance variables or fields (properties or attributes)
    private String brand = "Brand Not Listed";    // Brand Name
    private int volume = 0;       // Volume Level (min to max) in whole numbers only
    private DisplayType display = DisplayType.LED;  // otherwise, null if client doesn't say

    private boolean isMuted;    // for muting behavior, getter only (named "isMuted()").
    private int oldVolume;      // for muting behavior, internal use only, NO get/set methods.

    // constructors

    public Television(){
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume){
        this(brand);          // delegate to ctor above me for brand
        setVolume(volume);    // handle volume myself, by delegating to its setter
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // business methods or operations

    public void mute() {
        if (!isMuted()) {   // not currently muted
            oldVolume = getVolume();
            volume = 0;
            isMuted = true;
        }
        else {             // currently muted
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    public void turnOn() {

        // call private method for this task
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your " + brand + " TV to volume level: " + volume);
    }

    public void turnOff() {

        System.out.println("Shutting down your " + brand + " TV.  Goodbye!");
    }

    // Accessor Methods
    public String getBrand() {
        return brand;
    }

    // VALID_BRANDS looks like this:  ["Samsung", "LG", "Sony", "Toshiba"]
    // for (String validBrand : VALID_BRANDS {
    // check the incoming 'brand' against 'validBrand' using the equals() method
    // Using the "switch" method to validate the brand
    public void setBrand(String brand) {
        switch (brand) {
            case "Sony":
            case "Toshiba":
            case "LG":
            case "Samsung":
                this.brand = brand;
                break;
            default:
                System.out.println("You entered: " + brand + " which is an invalid brand. It must be a Sony, LG, " +
                        "Toshiba, or Samsung.");
        }
    }

    /* This is the if method to validate the brand
     *
     * if (brand.equals("Samsung") ||
     *     brand.equals("LG")      ||
     *     brand.equals("Sony")    ||
     *     brand.equals("Toshiba") {
     *     this.brand = brand;
     * }
     * else {
     *     System.out.println("Invalid brand: " + brand + "." +
     *        "Valid brands are: Samsung, LG, Sony, Toshiba.");
     * }
     */

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            // clear the 'isMuted' flag, in case it is muted.
            isMuted = false;
        }
        else {
                System.out.println("For your " + brand + " TV, the volume must be from " + MIN_VOLUME + " to "
                        + MAX_VOLUME + ". " + " You entered: " + volume + ", seting volume to 0");
            }
    }

    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true;  // fake implementation
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    //toString()
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television: Brand = " + brand + ", Volume = " + volumeString +
                ", Display Type = " + display;
    }

}
