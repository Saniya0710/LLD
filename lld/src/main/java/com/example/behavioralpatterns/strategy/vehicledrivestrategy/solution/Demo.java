package com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution;
import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.context.GoodsVehicle;
import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.context.HybridVehicle;
import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.context.SportsVehicle;
import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.context.Vehicle;
import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.strategies.EVDrive;
import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.strategies.NormalDrive;
import com.example.behavioralpatterns.strategy.vehicledrivestrategy.solution.strategies.SportsDrive;

public class Demo {
    
public static void main(String[] args) {


    Vehicle vehicle2 = new SportsVehicle(new SportsDrive());
    vehicle2.drive();

    Vehicle vehicle4 = new GoodsVehicle(new NormalDrive());
    vehicle4.drive();

    Vehicle vehicle5 = new HybridVehicle(new EVDrive());
    vehicle5.drive();
}
}
