package org.example.inheritance;

import static org.example.HelperClass.print;

public class CatFamily {
    protected int legs;
    protected int eyes;
    protected String food;

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isCanEatPeople() {
        return canEatPeople;
    }

    protected boolean canEatPeople;

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setCanEatPeople(boolean canEatPeople) {
        this.canEatPeople = canEatPeople;
    }

    /*public CatFamily() {
            this.legs = 4;
            this.eyes = 2;
            this.canEatPeople = true;
        }*/
    public CatFamily(int legs, int eyes,boolean canEatPeople) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPeople = canEatPeople;
        food = "Что попало ";
    }
    public void eat() {
        print("кушаю " + food);
    }

}
