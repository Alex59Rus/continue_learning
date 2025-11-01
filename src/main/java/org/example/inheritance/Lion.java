package org.example.inheritance;

import static org.example.HelperClass.print;

public class Lion extends CatFamily {
    public Lion() {
        super(4, 2, true);
        food = "антилопа";
    }

    @Override
    public void eat() {
        super.eat();
    }
}
