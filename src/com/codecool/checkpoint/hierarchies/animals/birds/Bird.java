package com.codecool.checkpoint.hierarchies.animals.birds;

import com.codecool.checkpoint.hierarchies.animals.Animal;

public abstract class Bird implements Animal {
    @Override
    public String breath() {
        return "Breath with lungs";
    }
}
