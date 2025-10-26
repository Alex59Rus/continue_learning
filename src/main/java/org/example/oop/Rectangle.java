package org.example.oop;

public class Rectangle {
    double width;
    double height;

    public double[] setDimensionsArray(double width, double height) {
        this.width = width;
        this.height = height;

        return new double[]{width, height};
    }

    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void showArea(double[] lengthSides) {
        double square = width * height;
        System.out.println(square);
    }

    public double showAreaElse() {
        System.out.println(this.height*this.width);
        return this.width * this.height;
    }
}
