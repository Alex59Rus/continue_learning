package org.example;

import org.example.interfaces.Client;
import org.example.interfaces.Waiter;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("soup");

        client.takeOrder(new Waiter() {
            @Override
            public void bringOrder(String wish) {
                System.out.println("this " + wish);
            }
        }, client.wish);
    }
}