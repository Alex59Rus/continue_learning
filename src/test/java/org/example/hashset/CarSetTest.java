package org.example.hashset;

import org.example.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarSetTest {
    private CarSet carSet;

    @BeforeEach
    public void setUp() throws Exception {
        carSet = new CarHashSet();
        for (int i = 0; i < 100; i++) {
            carSet.add(new Car("brand" + i, i));
        }
    }

    @Test
    public void add() {
        assertEquals(100, carSet.size());
    }

    @Test
    public void remove() {
        assertTrue(carSet.remove(new Car("brand1", 1)));
        assertEquals(99, carSet.size());
        assertFalse(carSet.remove(new Car("brand1", 1)));
        assertEquals(99, carSet.size());
    }

    @Test
    public void size() {
        assertEquals(100, carSet.size());
    }
    @Test
    public void whenAddedSimilarObjectsSizeNonIncreaseMoreThan1() {
        assertEquals(100, carSet.size());
        assertTrue(carSet.add(new Car("Toyota", 1)));
        assertFalse(carSet.add(new Car("Toyota", 1)));
        assertEquals(101, carSet.size());
    }

    @Test
    public void clear() {
        carSet.clear();
        assertEquals(0, carSet.size());
    }
}