package com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.strategies;

public class EVDrive implements DriveStrategy {
    
    @Override
    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Electric Vehicle Drive");
    }
    
}
