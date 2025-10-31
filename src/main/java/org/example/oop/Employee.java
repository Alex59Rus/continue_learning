package org.example.oop;

import static org.example.HelperClass.print;

public class Employee {

    String name;
    String position;
    double salary;
    double bonus;


    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String position, String name, double salary, double bonus) {
        this.position = position;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void showInfo() {
        print("Name: " + name + "\nPosition: " + position + "\nSalary: " + hasBonus(bonus));
    }

    public double hasBonus(double bonus) {
        return this.salary = bonus * salary;
    }
}
