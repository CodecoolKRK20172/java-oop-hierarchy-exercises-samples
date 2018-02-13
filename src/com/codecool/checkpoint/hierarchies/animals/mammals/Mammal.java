package com.codecool.checkpoint.hierarchies.animals.mammals;

import com.codecool.checkpoint.hierarchies.animals.Animal;

public abstract class Mammal implements Animal {
    @Override
    public String breath() {
        return "Breath with lungs";
    }
}
