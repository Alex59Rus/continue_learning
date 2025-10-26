package org.example.oop;

public class Dog {
    public String name;
    public String breed;
    public Double weight;
    public int speed;

    public void showInfo() {
        System.out.println("Name: " + name + "\nBreed: " + breed + "\nWeight: " + weight);
    }

    public void run(int speed) {
        for (int count = 1; count <= speed; count++) {
            System.out.println("i'm run");
        }
    }
}
