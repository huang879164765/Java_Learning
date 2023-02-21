package com.lessons.Generic;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, String attributes) {
        super(name, attributes);
    }

    void play() {
        System.out.println(this.getAttributes() + this.getName() + "在做游戏");
    }
}
