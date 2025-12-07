package org.example;

import org.example.arraylist.CarArrayList;
import org.example.oop.CarCollection;

import javax.swing.*;
import java.util.*;

import static javax.swing.JOptionPane.*;
import static org.example.HelperClass.*;

public class Main {
    public static void main(String[] args) {

        CarCollection cars = new CarArrayList();
        for (int i = 0; i < 11; i++) {
            cars.add(new Car("brand " + i, i));
        }
        print(cars);
        for (Car brand : cars) {
            print(brand.getBrand());
        }

        /*JOptionPane optionPane = new JOptionPane();
            int[] nums = {1,2,3,4,5};
            int[] newNums = new int[nums.length];
            for (int i = nums.length, j = 0; i != 0; i--, j++) {
                newNums[j] = nums[i - 1];
            }
            print(nums);
            print(newNums);*/
        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //print(list);
        //Collections.reverse(list);
        //print(list);
        //showMessageDialog(null, list, "List", WARNING_MESSAGE);
        //showMessageDialog(null,1>2?"true":"false");
        //showConfirmDialog(null,"asd");
        //showMessageDialog(null,"В следующем окне введите число");
        //String a = showInputDialog(null,"Введите число");
        //showMessageDialog(null,"Вы ввели "+a);

    }
}