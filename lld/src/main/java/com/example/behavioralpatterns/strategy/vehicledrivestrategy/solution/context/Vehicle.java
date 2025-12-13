package com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.context;
import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.strategies.DriveStrategy;

public class Vehicle {
    
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        driveStrategy.drive();

    }
}
