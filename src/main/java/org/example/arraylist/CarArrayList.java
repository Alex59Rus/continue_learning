package org.example.arraylist;

import org.example.Car;
import org.example.CarList;
import org.example.oop.CarCollection;

import java.util.Arrays;
import java.util.Iterator;

public class CarArrayList implements CarList {
    private Car[] cars = new Car[10];
    private int size = 0;

    @Override
    public boolean add(Car car) {
        checkVolumeArray();
        cars[size] = car;
        size++;
        return true;
    }

    @Override
    public boolean contains(Car car) {
        for (int i = 0; i < size; i++) {
            if (cars[i].equals(car)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Car car, int index) {
        checkVolumeArray();
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index out of bounds");
        }
        System.arraycopy(cars, index, cars, index + 1, size - index);
        cars[index] = car;
        size++;
        return true;
    }

    @Override
    public boolean remove(Car car) {
        for (int i = 0; i < size; i++) {
            if (cars[i].equals(car)) {
                return removeAt(i);
            }
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            cars[i] = cars[i + 1];
        }
        size--;
        return true;
    }

    @Override
    public void clear() {
        cars = new Car[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Car get(int index) {
        checkIndex(index);
        return cars[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkVolumeArray() {
        if (size >= cars.length) {
            cars = Arrays.copyOf(cars, cars.length * 2);
        }
    }

    @Override
    public Iterator<Car> iterator() {
        return new Iterator<Car>() {

            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Car next() {
                return cars[index++];
            }
        };
    }

/*    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(cars[i]);
        }
        return sb.toString();
    }*/

}
