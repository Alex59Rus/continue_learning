package org.example;

public interface CarList {

    void add(Car car);
    void add(Car car, int index);
    boolean remove(Car car);
    boolean removeAt(int index);
    void clear();
    int size();
    Car get(int index);
}
