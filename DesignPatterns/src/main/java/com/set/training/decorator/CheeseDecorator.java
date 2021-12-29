package com.set.training.decorator;

public class CheeseDecorator extends CustomizeSandwich{
    public CheeseDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public void makeSandwich() {
        this.customSandwich.makeSandwich();
        addCheese();
    }

    private void addCheese() {
        System.out.println(" Add cheese");
    }
}
