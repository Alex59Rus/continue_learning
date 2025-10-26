package org.example.oop;

public class Box {
    public double length;
    public double width;
    public double height;

    public void showVolumeArray(double[] a) {
        System.out.println(getVolume());
    }
    public void showVolume(double length, double width, double height) {
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

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Box() {
        this.length = 1;
        this.height = 1;
        this.width = 1;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }
}
