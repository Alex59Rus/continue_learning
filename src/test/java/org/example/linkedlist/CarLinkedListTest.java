package org.example.linkedlist;

import org.example.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarLinkedListTest {
    CarLinkedList list = new CarLinkedList();

    @BeforeEach
    public void setUp() {
        for (int i = 0; i < 100; i++) {
            list.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void contains() {
    }

    @Test
    void testIterator() {
        int index = 0;
        for (Car car : list) {
            index++;
        }
        assertEquals(index,list.size());
    }

}