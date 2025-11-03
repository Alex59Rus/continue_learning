package org.example.homeworks;

import org.example.multithreading.Timer;

import java.util.Random;

import static org.example.HelperClass.print;
import static org.example.multithreading.Timer.getSecondsCount;
import static org.example.multithreading.Timer.secWord;

public class Main {
    private static boolean success = false;
    private static final String divider = "----------------------------";
    private static final Random random = new Random();
    private static final int bound = 1_000_000_000;

    public static void main(String[] args) {
        int hiddenNumber = random.nextInt(bound);
        print(String.format("%s\nЗагаданное число - %d\n%s", divider, hiddenNumber, divider));

        Thread timer = new Thread(new Timer() {
            @Override
            public void run() {
                startTimer();
            }
        });
        timer.start();

        Thread guesser = new Thread(() -> {
            while (!success) {
                int guessingNumber = random.nextInt(bound);
                if (guessingNumber == hiddenNumber) {
                    success = true;
                    print(String.format("Я угадал число за %d %s! Это - %d",
                            getSecondsCount(),
                            secWord(getSecondsCount()),
                            guessingNumber
                    ));
                    timer.interrupt();
                }
            }
        });
        guesser.start();
    }
}
