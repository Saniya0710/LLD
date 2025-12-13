package com.example.behavioralpatterns.strategy.vehicledrivestrategy.problem;

public class SportsVehicle extends Vehicle {
    

    void drive() {
        
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Sports");

    }
}
