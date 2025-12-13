package com.example.behavioralpatterns.strategy.vehicledrivestrategy.problem;

public class OffRoadVehicle extends Vehicle{
    
    void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Off-Sports");
    }
}
