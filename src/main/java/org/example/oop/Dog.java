package org.example.oop;

import static org.example.HelperClass.print;

public class Dog {
    public String name;
    public String breed;
    public Double weight;
    public int speed;

    public void showInfo() {
        print("Name: " + name + "\nBreed: " + breed + "\nWeight: " + weight);
    }

    public void run(int speed) {
        for (int count = 1; count <= speed; count++) {
            print("i'm run");
        }
    }
}
