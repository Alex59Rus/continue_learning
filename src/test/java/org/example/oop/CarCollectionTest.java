package org.example.oop;

import org.example.Car;
import org.example.CarList;
import org.example.arraylist.CarArrayList;
import org.example.hashset.CarHashSet;
import org.example.linkedlist.CarLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarCollectionTest {

    CarCollection carCollection;

    @BeforeEach
    void setUp() {
        carCollection = new CarHashSet();
        for (int i = 0; i < 100; i++) {
            carCollection.add(new Car("brand" + i, i));
        }
    }

    @Test
    void contains() {
        Car car1 = new Car("BMV", 150);
        Car car = new Car("BMW", 101);
        assertTrue(carCollection.add(car));
        assertTrue(carCollection.contains(car), "try to find car: " + car + " in " + carCollection);
        assertFalse(carCollection.contains(car1), "try to find car: " + car1 + " in " + carCollection);
    }

    @Test
    public void testForEach() {
        int index = 0;
        for (Car car : carCollection) {
            index++;
        }
        assertEquals(100,index);
    }
}