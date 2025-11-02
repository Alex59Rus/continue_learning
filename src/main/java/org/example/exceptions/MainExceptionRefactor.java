/*
package org.example.exceptions;

import java.util.ArrayList;

import static org.example.HelperClass.print;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        int[] array = {1,2,3,4,5};
        try {
            for (int i = 0; i < array.length + 1; i++) {
                print(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            print("Выходим за пределы массива, тк ловим ошибку: " + e.getMessage());
        }
        try {
            for (int i = 0; i < list.size() + 1; i++) {
                print(list.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            print("Выходим за пределы списка, тк ловим ошибку: " + e.getMessage());
        }

                int a = 0;

        try {
            int b = 7 / 1;
            int c = Integer.parseInt("sadsa");
            double с = 1;
        } catch (ArithmeticException e) {
            print("На ноль делить нельзя!");
        }
        catch (Exception e) {
            print("Возникла ошибка по причине: " + e.getMessage());
            print("Возникла ошибка в: " + e.getClass());
            print("Возникла ошибка с: " + e.getCause());
        }
    }
}
*/
