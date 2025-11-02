package org.example.multithreading;

import static org.example.HelperClass.pause;
import static org.example.HelperClass.print;
import static org.example.multithreading.Timer.startTimer;

public class Main {
    public static void main(String[] args) {
        //startTimer();
        Thread thread = new Thread(new Timer());
        thread.start();

        Thread thread1 = new Thread(() -> {
            for (int i = 10_000_000; i != 0; i--) {
                print(i);
                pause(2000);
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 10_000_000; j++) {
                    print("meow");
                    pause(500);
                }
            }
        });
        thread2.start();
    }
}
