package com.example.structuralpatterns.decorator;

public class Pepperonitopping extends ToppingDecorator {

    public Pepperonitopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription() + ", Pepperoni Topping";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 40;
    }
    
}
