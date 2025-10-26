package org.example.oop;

public class MyMath {

    public static int multiply(int a, int b) {
        System.out.println("Multiplying " + a + " and " + b + " = " + a * b);
        return a * b;
    }

    public static double multiply(double a, double b) {
        System.out.println("Multiplying " + a + " and " + b + " = " + a * b);
        return a * b;
    }

    public static int multiply(int a) {
        return multiply(a, a);
    }
}
