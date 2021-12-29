package com.set.training.decorator;

public abstract class CustomizeSandwich implements Sandwich {

    Sandwich customSandwich;

    public CustomizeSandwich(Sandwich sandwich) {
        this.customSandwich = sandwich;
    }
}
