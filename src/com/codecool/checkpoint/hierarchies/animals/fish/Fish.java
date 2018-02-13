package com.codecool.checkpoint.hierarchies.animals.fish;

import com.codecool.checkpoint.hierarchies.animals.Animal;

public abstract class Fish implements Animal {
    @Override
    public String breath() {
        return "Breathe with skrzela";
    }
}
