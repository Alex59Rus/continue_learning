package org.example.homeworks;

public class HomeWorkMonster {
        int countEye;
        int countArms;
        int countLegs;

    public HomeWorkMonster() {
        this.countEye = 2;
        this.countArms = 2;
        this.countLegs = 2;
    }

    public HomeWorkMonster(int count) {
        this(count,count,count);
    }
    public HomeWorkMonster(int countEye, int countArms, int countLegs) {
        this.countEye = countEye;
        this.countArms = countArms;
        this.countLegs = countLegs;
    }

    public void voice() {
        voice(1);
    }
    public void voice(int count) {
        voice(count,"Grrr..!!!!");
    }
    public void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
