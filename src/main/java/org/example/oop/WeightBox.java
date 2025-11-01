package org.example.oop;

import static org.example.HelperClass.print;

public class WeightBox extends Box {
    double weight;

    public WeightBox(Double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        print("WEIGHT: " + this.weight);
    }
}
