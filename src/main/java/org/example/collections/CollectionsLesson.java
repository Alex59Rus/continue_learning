package org.example.collections;

import java.util.ArrayList;
import java.util.HashSet;

import static org.example.HelperClass.print;

public class CollectionsLesson {
    public static void countNames(ArrayList<String> name, ArrayList<Integer> count) {
        ArrayList<String> result = new ArrayList<>();
        int counter = Math.max(count.size(), name.size());
        for (int i = 0; i < counter; i++) {
            if (name.get(i) == null) {
                result.add("Empty Name" + " - " + count.get(i));
            } else if (count.get(i) == null) {
                result.add(name.get(i) + " - " + "Empty Count");
            } else {
                result.add(name.get(i) + " - " + count.get(i));
            }
        }
        print(result);
    }

    private static ArrayList<String> getEmployees() {
        ArrayList<String> newEmployees = new ArrayList<>();
        newEmployees.add("Alex");
        newEmployees.add("Jack");
        newEmployees.add("Sam");
        return newEmployees;
    }
}
