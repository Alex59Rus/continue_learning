package org.example.inheritance;

import static org.example.HelperClass.print;

public class Cat extends CatFamily {

    public Cat() {
        super(4, 2, false);
        setLegs(4);
        legs = 4;
        food = "висканс";
    }

    @Override
    public void eat() {
        super.eat();
    }
}
