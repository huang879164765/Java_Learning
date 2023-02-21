package com.lessons.Generic;

import java.util.List;

public class AnimalPlay {
    public <T extends Animal> void display(List<T> animalList) {
        for (T t : animalList) {
            t.play();
        }
    }
}
