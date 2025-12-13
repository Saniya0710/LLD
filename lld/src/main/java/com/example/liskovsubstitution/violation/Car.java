package com.example.liskovsubstitution.violation;

public class Car extends Vehicle{
    
    @Override
    public Integer getNumberofWheels() {
        return 4;
    }
}
