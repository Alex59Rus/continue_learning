package org.example.oop;

public class Box {
    public double length;
    public double width;
    public double height;

    public void showVolume(double[] a) {
        System.out.println(getVolume());
    }

    public double getVolume() {
        return length * width * height;
    }

    public double[] setDimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        return new double[]{length, width, height};
    }
}
