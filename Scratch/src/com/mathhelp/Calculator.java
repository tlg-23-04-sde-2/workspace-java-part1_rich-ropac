package com.mathhelp;

/*
 *  This is an "all static" class, i.e., one that contains only static methods.
 */
class Calculator {

    // add, subtract, isEven
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 14.
     *
     * HINT:  See a class called Math (in package java.lang), look for a helpful method here.
     * NOTE these methods in the Match class are all "static" which means you call them as:
     *  Math.methodName()
     */

     public static int getRandomInt() {
         int result = 0;

         double rand = 1 + (Math.random() * 14);                        // 0.00000 to 0.99999
         // double scaled = 1 + (rand * 14);                          // 0.00000 to 13.99999
         // double scaledFloor = Math.floor(scaled) + 1;        // 1.00000 to 14.00000

         // convert (via explicit downcast) the double to int
         result = (int) rand;
         return result;
     }

     /*
      * Returns a random integer between 'min' and 'max' (inclusive)
      */
      public static int getRandomInt(int min, int max){
          int result = 0;
          double rand = min + (Math.random() * (max-min+1));
          result = (int) rand;
          return result;
      }

      /*
       *  Returns the average (arithmetic mean) of the supplied integers.
       *  getAverage()
       *  aveInt()
       *  averageator()
       *  xbar()
       * getMean()
       */

      public static double getAverage(int first, int... rest) {    // 3, 5, 9, 9
          double result = 0.0;

          double sum = first;
          for (int value : rest) {
              sum += value;              //which is the same as sum = sum + value;
          }
          result = sum / (1 + rest.length);  // at runtime, values IS AN array


          return result;

      }
}