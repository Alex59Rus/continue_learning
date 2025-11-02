package org.example.interfaces;

import static org.example.HelperClass.print;

public class Client {
    public String wish;

    public Client(String wish) {
        this.wish = wish;
    }

    public void takeOrder(Waiter waiter, String wish) {
        waiter.bringOrder(wish);
        }

        /// To main
/*          Client client = new Client("soup");
            Client client2 = new Client("fish");
            Client client3 = new Client("meat");
            WaiterOne waiterOne = new WaiterOne();

        //АНОНИМНЫЙ КЛАСС
        client.takeOrder(new Waiter() {
        @Override
        public void bringOrder(String wish) {
            print("this your`s " + wish);
        }
    }, client.wish);

        //ЛЯМБДА ВЫРАЖЕНИЕ
        client2.takeOrder(wish -> print("this your`s " + wish), client2.wish);

        //СТАРАЯ РЕАЛИЗАЦИЯ
        client3.takeOrder(waiterOne, client3.wish);*/
}
