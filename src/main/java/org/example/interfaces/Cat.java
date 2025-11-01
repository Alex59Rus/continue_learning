package org.example.interfaces;

import static org.example.HelperClass.print;

public class Cat extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void run() {
        print("cat running");
    }
}
