package org.example.interfaces;

public class Client {
    public String wish;

    public Client(String wish) {
        this.wish = wish;
    }

    public void takeOrder(Waiter waiter, String wish) {
        this.wish = wish;
        waiter.bringOrder(wish);
        }
}
