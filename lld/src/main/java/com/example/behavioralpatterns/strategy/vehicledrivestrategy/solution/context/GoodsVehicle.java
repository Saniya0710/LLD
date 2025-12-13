package com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.context;

import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.strategies.DriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
    
}
