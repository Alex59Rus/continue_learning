package org.example;

import org.example.interfaces.Client;
import org.example.interfaces.Waiter;
import org.example.interfaces.WaiterOne;

import static org.example.HelperClass.print;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("soup");
        Client client2 = new Client("fish");
        Client client3 = new Client("meat");
        WaiterOne waiterOne = new WaiterOne();

        client.takeOrder(new Waiter() {
            @Override
            public void bringOrder(String wish) {
                print("this your`s " + wish);
            }
        }, client.wish);

        client2.takeOrder(wish -> print("this your`s " + wish), client2.wish);

        client3.takeOrder(waiterOne, client3.wish);
    }
}