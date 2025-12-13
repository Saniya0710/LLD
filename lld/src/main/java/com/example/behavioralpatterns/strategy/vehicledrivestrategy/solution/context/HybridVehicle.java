package com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.context;
import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.strategies.DriveStrategy;

public class HybridVehicle extends Vehicle {
    
    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
