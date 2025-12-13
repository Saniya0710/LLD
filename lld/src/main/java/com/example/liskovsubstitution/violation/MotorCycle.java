package com.example.liskovsubstitution.violation;

public class MotorCycle extends Vehicle{
    
    public String getSpecifications() {
        return "MotorCycle has" + this.getNumberofWheels() + " wheels and engine: " + this.hasEngine();
    }
}
