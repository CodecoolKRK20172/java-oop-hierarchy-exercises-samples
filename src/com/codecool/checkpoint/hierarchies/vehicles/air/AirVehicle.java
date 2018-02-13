package com.codecool.checkpoint.hierarchies.vehicles.air;

import com.codecool.checkpoint.hierarchies.vehicles.Vehicle;

public abstract class AirVehicle implements Vehicle {
    @Override
    public String move() {
        return "Fly";
    }
}
