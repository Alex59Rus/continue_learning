package org.example.multithreading;

import static org.example.HelperClass.pause;
import static org.example.HelperClass.print;

public class Timer implements Runnable {
    String timer = "00:00:00";

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            print(i);
            pause(1000);
        }
    }

    public static void startTimer() {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        while (hours < 1) {
            for (int sec = 0; sec <= 60; sec++) {
                //pause(1000);
                print(hours+":"+minutes+":"+seconds);
                seconds++;
                if (seconds == 60) {
                    seconds = 0;
                    minutes++;
                    if (minutes == 60) {
                        minutes = 0;
                        hours++;
                    }
                }
            }
        }
    }

}
