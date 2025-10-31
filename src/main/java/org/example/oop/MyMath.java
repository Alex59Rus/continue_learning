package org.example.oop;

import static org.example.HelperClass.print;

public class MyMath {
    private static final double PI = 3.141592653589793;

    public static double length(double radius) {
        //return 2 * Math.PI * radius;
        return 2 * PI * radius;
    }

    public static int multiply(int a, int b) {
        print("Multiplying " + a + " and " + b + " = " + a * b);
        return a * b;
    }

    public static double multiply(double a, double b) {
        print("Multiplying " + a + " and " + b + " = " + a * b);
        return a * b;
    }

    public static int multiply(int a) {
        return multiply(a, a);
    }
}
