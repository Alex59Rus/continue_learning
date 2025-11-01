package org.example.inheritance;

public class Triangle extends Shape {
    private double c;

    @Override
    public double perimeter() {
        return getA()+getB()+getC();
    }
    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }
    public Triangle(double c) {
        this.c = c;
        setA(c);
        setB(c);
    }
    public Triangle() {
        super();
        c = 1;
    }
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
