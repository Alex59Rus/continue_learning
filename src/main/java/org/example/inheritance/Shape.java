package org.example.inheritance;

public abstract class Shape {
    protected double a;
    protected double b;

    protected abstract double perimeter();

    public Shape() {
        a = 1;
        b = 1;
    }

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Shape(double a) {
        this.a = a;
        b = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
