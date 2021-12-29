package com.set.training.decorator;

public class PlainSandwich implements Sandwich {

    @Override
    public void makeSandwich() {
        System.out.println("Plain sandwich");
    }
}
