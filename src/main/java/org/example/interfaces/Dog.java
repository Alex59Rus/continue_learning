package org.example.interfaces;

import static org.example.HelperClass.print;

public class Dog extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void run() {
        print("dog running");
    }
}
