package org.example.inheritance;

public class Rectangle extends Shape {

    public Rectangle() {
        super();
    }
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return a+a+b+b;
    }
}
