package org.example.homeworks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class homeWork_1 {
    public static class Human {
        private String name;
        private int age;
        private double weight;


    }

    public static double middleAge(int... ages) {
        if (ages.length == 0) {
            throw new IllegalArgumentException("Список возрастов пуст");
        }

        double sum = 0.0;
        for (int age : ages) {
            sum += age;
        }
        double average = sum / ages.length;

        BigDecimal bd = BigDecimal.valueOf(average)
                .setScale(3, RoundingMode.HALF_DOWN);
        average = bd.doubleValue();
        return average;
    }
}
