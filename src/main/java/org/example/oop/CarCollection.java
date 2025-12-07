package org.example.oop;

import org.example.Car;

public interface CarCollection extends Iterable<Car> {
    boolean add(Car car);

    boolean remove(Car car);

    void clear();

    boolean contains(Car car);

}
