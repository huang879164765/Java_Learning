package com.lessons.Generic;

public abstract class Animal {
    private String name;

    private String Attributes;

    public Animal() {
    }

    public Animal(String name, String attributes) {
        this.name = name;
        Attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttributes() {
        return Attributes;
    }

    public void setAttributes(String attributes) {
        Attributes = attributes;
    }

    abstract void play();
}
