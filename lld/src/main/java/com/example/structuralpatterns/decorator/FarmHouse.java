package com.example.structuralpatterns.decorator;

public class FarmHouse implements BasePizza{
    
@Override
public String getDescription() {
    return "FarmHouse Pizza";
}

@Override
public double getCost() {
    return 150;
}
}
