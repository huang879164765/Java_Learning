package com.lessons.Polymorphism;

public class Animal {
    private String kind;

    public Animal() {
    }

    public Animal(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void cry() {
        System.out.println("动物会叫");
    }
}
