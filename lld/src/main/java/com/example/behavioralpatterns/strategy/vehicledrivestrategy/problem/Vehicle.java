package com.example.behavioralpatterns.strategy.vehicledrivestrategy.problem;

public class Vehicle {
    
    void drive() {
        
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Normal");

    }
}
