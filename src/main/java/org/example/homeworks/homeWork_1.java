package org.example.homeworks;

public class homeWork_1 {
    public static class Human {
        public String name;
        public int age;
        public double weight;
    }

    public static double middleAge(int[] ages) {
        double sum = 0;
        for (int age : ages) {
            sum += (double) age /ages.length;
        }
        return sum;
    }
}
