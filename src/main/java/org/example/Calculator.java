package org.example;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
    double mul(int a, int b) {
        return a * b;
    }
    double div(int a, int b) {
        return a / b;
    }
    int add(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
    int sub(String a, String b) {
        return Integer.parseInt(a) - Integer.parseInt(b);
    }
    int div(String a, String b) {
        return Integer.parseInt(a) / Integer.parseInt(b);
    }
    int mul(String a, String b) {
        return Integer.parseInt(a) * Integer.parseInt(b);
    }
}
