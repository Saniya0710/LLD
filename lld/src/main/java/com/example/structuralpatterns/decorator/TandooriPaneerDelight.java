package com.example.structuralpatterns.decorator;

public class TandooriPaneerDelight implements BasePizza{
    

    @Override
    public String getDescription() {
        return "Tandoori Paneer Delight Pizza";
    }
    @Override
    public double getCost() {
        return 180;
    }
}
