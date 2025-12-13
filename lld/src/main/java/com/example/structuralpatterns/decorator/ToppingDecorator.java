package com.example.structuralpatterns.decorator;

abstract class ToppingDecorator implements BasePizza {
    
    BasePizza basePizza;
    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
