package com.codecool.checkpoint.hierarchies.vehicles.land;

import com.codecool.checkpoint.hierarchies.vehicles.Vehicle;

public abstract class LandVehicle implements Vehicle {
    @Override
    public String move() {
        return "Move on the wheels";
    }
}
