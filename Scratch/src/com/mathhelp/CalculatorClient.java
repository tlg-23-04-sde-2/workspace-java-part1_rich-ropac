package com.mathhelp;

import static com.mathhelp.Calculator.*;   //don't need to use Calculator. below


class CalculatorClient {

    public static void main(String[] args) {
        // ok to pass ints where doubles are expected, an implicit upcast
        double sum = Calculator.add(3, 5);
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + Calculator.subtract(3.1, 5.1));

        int input = 10;
        System.out.println(input + " is even: " + Calculator.isEven(input));
        System.out.println();

        System.out.println(Calculator.getRandomInt());

        System.out.println(Calculator.getRandomInt(6,15));

        System.out.println(Calculator.getAverage(3, 5, 9, 9)); // any number of "loose" ins
        System.out.println(Calculator.getAverage(56));                  // I must pass at least one
    }
}