package org.example;

import org.example.oop.CarCollection;

public interface CarList extends CarCollection {

    boolean add(Car car);

    boolean add(Car car, int index);

    boolean remove(Car car);

    boolean removeAt(int index);

    void clear();

    int size();

    Car get(int index);
}
