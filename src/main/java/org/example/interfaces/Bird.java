package org.example.interfaces;

public class Bird extends Animal implements AbleToRun,AbleToFly{
    @Override
    public void eat() {
        System.out.println("Bird eat");
    }
    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void run() {
        System.out.println("Bird run");
    }
}
