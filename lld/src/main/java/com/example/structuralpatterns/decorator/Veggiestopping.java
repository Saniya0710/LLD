package com.example.structuralpatterns.decorator;

public class Veggiestopping extends ToppingDecorator {

    public  Veggiestopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + ", Veggie Topping";
    }
    @Override
    public double getCost() {
        return basePizza.getCost() + 25;
    }
}

