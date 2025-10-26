package org.example;

import java.util.Scanner;
import java.util.Set;

import static java.lang.Integer.parseInt;

public class SwitchCase {

    public static void whichMonth() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите номер месяца от 1 до 12:");
            String userInput = input.nextLine().trim();

            try {
                int month = Integer.parseInt(userInput);
                Set<Integer> validValues = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
                if (validValues.contains(month)) {
                    printMonth(month);
                    break;
                } else {
                    System.out.println("Число должно быть от 1 до 12!, а не " + userInput);
                }
            } catch (NumberFormatException e) {
                System.out.println("Это не число! Введите от 1 до 12, а не " + userInput);
            }
        }
        input.close();
    }

    public static void printMonth(int month) {
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }
    }
}
