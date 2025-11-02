package org.example;

import java.util.Arrays;
import java.util.Collection;

public class HelperClass {

    public static void print(Object o) {
        System.out.println(o);
    }
    public static void print(Collection<?> c) {
        System.out.println(c);
    }
    public static void print(String[] a) {
        System.out.println(Arrays.toString(a));
    }
}
