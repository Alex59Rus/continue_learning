package org.example.collections;

import java.util.Arrays;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String value) {
        String[] newArray = new String[size + 1];
        array[size] = value;
        size++;
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != null) {
                newArray[j] = value;
                j++;
            }
        }
    }
    public void remove(int index) {


    }

    public void remove(String value) {
        for (int i = 0, j = 0; i < array.length; j++) {
            if (array[i].equals(value)){
                array[j] = null;
                size--;
                break;
            }
        }
    }
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);}
}
