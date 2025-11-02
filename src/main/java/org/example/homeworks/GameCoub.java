package org.example.homeworks;

import java.util.Random;

import static org.example.HelperClass.pause;
import static org.example.HelperClass.print;

public class GameCoub {
    private static final Random rand = new Random();

    public static void startGame(int throwNumbers) {
        for (int i = 1; i <= throwNumbers; i++) {
            pause(100);
            print(String.format("Попытка #%d, БРОСАЮ КУБИК!",i));
            pause(1000);
            print(String.format("Ваше число %d!", rand.nextInt(1,7)));
        }
    }
}
