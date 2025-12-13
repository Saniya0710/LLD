package com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.context;

import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.strategies.DriveStrategy;

public class OffRoadVehicle extends Vehicle {
 
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
