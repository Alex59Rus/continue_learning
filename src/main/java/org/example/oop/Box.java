package org.example.oop;

public class Box {
    public double length;
    public double width;
    public double height;

    public void volume(double length, double width, double height) {
        double volume = length * width * height;
        System.out.println(volume);
    }
}
