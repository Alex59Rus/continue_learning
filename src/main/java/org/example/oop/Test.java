package org.example.oop;

import static org.example.HelperClass.print;

public class Test {
    public int x;

    public void showSquare(int x) {
        print(getSquare());
    }
    public int getSquare() {
        return x * x;
    }
}
