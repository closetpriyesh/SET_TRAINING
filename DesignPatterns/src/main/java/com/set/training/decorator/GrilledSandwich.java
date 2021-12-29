package com.set.training.decorator;

public class GrilledSandwich implements Sandwich {

    @Override
    public void makeSandwich() {
        System.out.println("Grilled sandwich");
    }
}
