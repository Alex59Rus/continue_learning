package org.example.interfaces;

import static org.example.HelperClass.print;

public class WaiterOne implements Waiter {

    @Override
    public void bringOrder(String wish) {
        print("this your`s " + wish);
    }
}
