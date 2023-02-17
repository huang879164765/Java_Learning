package com.lessons.Polymorphism;

public class Circle extends Shape{

    private int radius;
    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("圆形面积为：" + Math.PI * Math.pow(this.radius, 2));
    }
}
