package org.example;

import org.example.interfaces.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Programmer programmer = new Programmer();
        Cook cook = new Cook();

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(programmer);
        drivers.add(cook);
        for (Driver driver : drivers) {
            driver.drive();
        }
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(programmer);
        workers.add(cook);
        workers.add(director);
        for (Worker worker : workers) {
            worker.work();
        }
    }
}