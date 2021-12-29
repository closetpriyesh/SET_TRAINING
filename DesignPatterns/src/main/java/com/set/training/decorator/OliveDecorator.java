package com.set.training.decorator;

public class OliveDecorator extends CustomizeSandwich {

    public OliveDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public void makeSandwich() {
        this.customSandwich.makeSandwich();
        addOlive();
    }

    private void addOlive() {
        System.out.println(" Add olive");
    }
}
