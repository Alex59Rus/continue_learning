package org.example;

import java.util.Scanner;
import java.util.Set;

import static java.lang.Integer.parseInt;
import static org.example.HelperClass.print;

public class SwitchCase {

    public static void whichMonth() {
        Scanner input = new Scanner(System.in);
        while (true) {
            print("\nВведите номер месяца от 1 до 12:");
            String userInput = input.nextLine().trim();

            try {
                int month = Integer.parseInt(userInput);
                Set<Integer> validValues = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
                if (validValues.contains(month)) {
                    printMonth(month);
                    break;
                } else {
                    print("Число должно быть от 1 до 12!, а не " + userInput);
                }
            } catch (NumberFormatException e) {
                print("Это не число! Введите от 1 до 12, а не " + userInput);
            }
        }
        input.close();
    }

    public static void printMonth(int month) {
        switch (month) {
            case 1 -> print("January");
            case 2 -> print("February");
            case 3 -> print("March");
            case 4 -> print("April");
            case 5 -> print("May");
            case 6 -> print("June");
            case 7 -> print("July");
            case 8 -> print("August");
            case 9 -> print("September");
            case 10 -> print("October");
            case 11 -> print("November");
            case 12 -> print("December");
        }
    }
}
