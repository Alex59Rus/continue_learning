package org.example.oop;

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

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }

    public double hasBonus(double bonus) {
        return  this.salary = bonus * salary;
    }
}
