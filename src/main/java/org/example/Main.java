package org.example;

import org.example.homeworks.HomeWorkIncrease;
import org.example.oop.Box;
import org.example.HelperClass;

import static org.example.HelperClass.print;
import static org.example.oop.MyMath.multiply;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = box.increase(box, 4);

        box.showLengthSides();
        box2.showLengthSides();
        print(box.getVolume());
        print(box2.getVolume());

    }
}