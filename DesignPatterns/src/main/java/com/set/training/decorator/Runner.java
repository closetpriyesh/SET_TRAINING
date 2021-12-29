package com.set.training.decorator;

public class Runner {
    public static void main(String[] args) {
        Sandwich sandwich = new CheeseDecorator(new OliveDecorator(new OliveDecorator(new PlainSandwich())));
        sandwich.makeSandwich();
        sandwich = new CheeseDecorator(new OliveDecorator(new GrilledSandwich()));
        sandwich.makeSandwich();
    }
}
