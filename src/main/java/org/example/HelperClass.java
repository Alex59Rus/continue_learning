package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class HelperClass {
    private static final Scanner input = new Scanner(System.in);


    public static void print(Object o) {
        System.out.println(o);
    }

    public static void print(Collection<?> c) {
        System.out.println(c);
    }

    public static void print(String[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static String inputStr() {
        return input.nextLine();
    }

    public static int inputInt() {
        while (true) {
            String line = null;
            try {
                line = input.nextLine();
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                print("'" + line + "'" + " это не число, поэтому " +
                        "\nВыходит ошибка: " + e.getMessage() +
                        "\nКласса: " + e.getClass().getSimpleName() +
                        //"\nДополнительная информация: " + e.getLocalizedMessage())
                        //"\ncause: " + e.getCause() +
                        //"\nsuppresse: " + Arrays.toString(e.getSuppressed()) +
                        "\nДополнительная информация: " + Arrays.toString(e.getStackTrace()));
            }
        }
    }
    public static void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
