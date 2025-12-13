package com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.context;

import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.strategies.DriveStrategy;

public class SportsVehicle extends Vehicle{
    
  public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }   
    
}
