package ex.periment;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 56;
        System.out.println("The value of age is "+ age);

        long population = 8_000_000_000L;
        System.out.println("The population is " + population);

        double weight = 135.5;
        System.out.println("The weight is " + weight);

        boolean hasTwins = false;
        System.out.println("I have twins: " + hasTwins);

        char shirtSize = 'L';
        System.out.println("The shirt size is: " + shirtSize);

        String name = "Rich";
        System.out.println("The name is: " + name);

        //TODO: print the following sentence (as a string)
        // The word "belly" makes me laugh
        System.out.println("The world \"belly\" makes me laugh");

        System.out.println();

        int i = 18;
        int j = i;
        i++;                         // i is now 19
        System.out.println(i);

        int x = 3;
        System.out.println("x is: " + x++);  // post increment for x
        System.out.println("x is: " + x);  // pre increment for x
    }
}