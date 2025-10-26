package org.example;

public class forEach {
    static int[] numbers = {1, 2, 3, 4, 5, 6, 3, 3, 3};
    static String[] names = {
            "Alex",
            "Fill",
            "Max"
    };
    public static void printString(String[] names) {
        for (String name : names) {
            System.out.println();
            System.out.println(name);
        }
    }

    public static void printInt(int[] numbers) {
        for (int name : numbers) {
            System.out.println();
            System.out.println(name);
        }
    }
}
