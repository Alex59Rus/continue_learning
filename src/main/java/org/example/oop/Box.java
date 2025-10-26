package org.example.oop;

import static org.example.HelperClass.print;

public class Box {
    public double length;
    public double width;
    public double height;

    public void showVolumeArray(double[] a) {
        print(getVolume());
    }

    public void showVolume(double length, double width, double height) {
        print(getVolume());
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
        this(10);
    }

    public Box(double size) {
        this(size, size, size);
    }

    public void showVolume() {
        print(getVolume());
    }

    /*    public void compare(Box anotherBox) {
            double currentVolume = getVolume();
            double anotherVolume = anotherBox.getVolume();
            if (currentVolume > anotherVolume) {
                System.out.println("Текущая коробка больше");
            } else if (currentVolume < anotherVolume) {
                System.out.println("Текущая коробка меньше");
            }else {
                System.out.println("Они равны");
            }
        }*/
    public int compare(Box box) {
        double currentVolume = getVolume();
        double anotherVolume = box.getVolume();
        if (currentVolume > anotherVolume) {
            return 1;
        } else if (currentVolume < anotherVolume) {
            return -1;
        } else {
            return 0;
        }
    }

    public Box(Box box) {
        this(box.length, box.width, box.height);
    }

    public Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    public Box increase(Box box, int countMultuply) {
        return new Box(this.length * countMultuply, this.width * countMultuply, this.height * countMultuply);
    }

    public void showLengthSides() {
        print("LENGTH = " + this.length);
        print("WIDTH = " + this.width);
        print("HEIGHT = " + this.height);
    }
}
