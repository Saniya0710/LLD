package com.example.structuralpatterns.decorator;

public class Mushroomtopping extends ToppingDecorator{
    
    public Mushroomtopping(BasePizza basePizza) {
        super(basePizza);

    }
    @Override
    public String getDescription() {
        return basePizza.getDescription() + ", Mushroom Topping";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 40;
    }
}
