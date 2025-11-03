package org.example.multithreading;

import static org.example.HelperClass.pause;
import static org.example.HelperClass.print;

public class Timer implements Runnable {
    public static int secondsCount = 0;
    @Override
    public void run() {
    }

    public static void startTimer() {
        int hours = 0, minutes = 0, seconds = 0;

        while (!Thread.currentThread().isInterrupted()) {
            print(hours + ":" + minutes + ":" + seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                print("Timer stopped");
                Thread.currentThread().interrupt();
                break;
            }
            secondsCount++;
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
    public static int getSecondsCount() {
        return secondsCount;
    }
    public static String secWord(int seconds) {
        String word = "";
        if (seconds == 1) {
            return word = "секунду";
        } else if (seconds >= 2 && seconds <= 4) {
            return word = "секунды";
        } return word = "секунд";
    }
}
