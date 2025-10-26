package org.example;

import java.util.Arrays;

public class HomeWorkForEach {
    public static void printArray(int startValue, int endValue, int step) {
        int countArray = (endValue - startValue)/step;
        int[] numbers = new int[countArray + 1];
        int counter = 0;
        for (int i = startValue; i <= endValue; i=i+step) {
            if (counter >= numbers.length) {
                break;
            }
            numbers[counter] = i;
            counter++;
        }
        System.out.println(Arrays.toString(numbers));
    }

}
