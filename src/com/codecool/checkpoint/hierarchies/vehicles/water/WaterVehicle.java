package com.codecool.checkpoint.hierarchies.vehicles.water;

import com.codecool.checkpoint.hierarchies.vehicles.Vehicle;

public abstract class WaterVehicle implements Vehicle {
    @Override
    public String move() {
        return "Move on the water";
    }
}
