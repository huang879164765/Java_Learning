package com.lessons;

import com.lessons.Polymorphism.Animal;
import com.lessons.Polymorphism.Cat;
import com.lessons.Polymorphism.Dog;
import com.lessons.Polymorphism.Sheep;

import java.util.Random;

public class AnimalTest {

    public static void getAnimals() {
        Animal[] animals = new Animal[5];
        for (int i = 0; i < animals.length; i++) {
            int num = new Random().nextInt(3);
            switch (num) {
                case 0: animals[i] = new Cat();
                break;
                case 1: animals[i] = new Dog();
                break;
                case 2: animals[i] = new Sheep();
                break;
            }
        }

        for (Animal animal : animals) {
            animal.cry();
        }
    }
    public static void main(String[] args) {
        getAnimals();
    }
}
