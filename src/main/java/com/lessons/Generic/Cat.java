package com.lessons.Generic;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String attributes) {
        super(name, attributes);
    }

    void play() {
        System.out.println(this.getAttributes() + this.getName() + "在做游戏");
    }
}
