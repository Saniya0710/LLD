package com.example.structuralpatterns.decorator;

public class ExtraCheezetopping extends ToppingDecorator{
    
    public ExtraCheezetopping(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public String getDescription() {
        return basePizza.getDescription() + ", ExtraCheese Topping";
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 30;
    }
}
