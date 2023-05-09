/*
 * Business class (system class) to model the workings of a television.
 */
class Television {

    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    public static int getInstanceCount() {

        return instanceCount;
    }

    // instance variables or fields (properties or attributes)
    private String brand = "Generic";    // Brand Name
    private int volume = 1;              // Volume Level (1-10) in whole numbers only

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

    // business methods or operations
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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean verifyInternetConnection() {
        return true;  // fake implementation
    }

    //toString()
    public String toString() {
        return "Television: Brand = " + brand + ", Volume = " + volume;
    }

}
