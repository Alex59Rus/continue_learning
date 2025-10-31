package org.example.oop;

import static org.example.HelperClass.print;

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
        print(square);
    }

    public double showAreaElse() {
        print(this.height*this.width);
        return this.width * this.height;
    }
}
