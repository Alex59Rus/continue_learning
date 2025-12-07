package org.example.hashset;

import org.example.Car;

import java.util.Iterator;

public class CarHashSet implements CarSet {
    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;
    private Entry[] array = new Entry[INITIAL_CAPACITY];
    private static final double LOAD_FACTOR = 0.75;

    @Override
    public boolean add(Car car) {
        if (size >= array.length * LOAD_FACTOR) {
            increaseArray();
        }
        boolean added = add(car, array);
        if (added) {
            size++;
        }
        return added;
    }

    @Override
    public boolean remove(Car car) {
        int position = getElementPosition(car, array.length);
        Entry current = array[position];
        Entry previous = null;

        while (current != null) {
            if (current.equals(car)) {
                if (previous == null) {
                    array[position] = current.next;
                } else  {
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean contains(Car car) {
        int position = getElementPosition(car, array.length);
        Entry current = array[position];
        while (current != null) {
            if (current.value.equals(car)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    private int getElementPosition(Car car, int arrayLength) {
        return Math.abs(car.hashCode() % arrayLength);
    }

    @Override
    public Iterator<Car> iterator() {
        return null;
    }

    private static class Entry {
        private final Car value;
        private Entry next;

        public Entry(Car value, Entry next) {
            this.value = value;
            this.next = next;
        }
    }

    private void increaseArray() {
        Entry[] oldArray = array;
        array = new Entry[array.length * 2];
        System.arraycopy(oldArray, 0, array, 0, oldArray.length);

    }

    private boolean add(Car car, Entry[] dst) {
        int position = getElementPosition(car, dst.length);
        Entry current = dst[position];

        // Проверяем, есть ли уже такой элемент
        while (current != null) {
            if (current.value.equals(car)) {
                return false; // уже существует
            }
            current = current.next;
        }

        // Добавляем в голову списка (проще и быстрее)
        Entry newEntry = new Entry(car, dst[position]);
        dst[position] = newEntry;
        return true;
    }

    @Override
    public Iterator<Car> iterator() {
        return new Iterator<Car>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Car next() {
                return null;
            }
        }
    }
}
