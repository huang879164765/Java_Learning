package com.lessons.Polymorphism;

public class Rectangle extends Shape{
    private int length;

    private int wide;

    public Rectangle() {
    }

    public Rectangle(int length, int wide) {
        this.length = length;
        this.wide = wide;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    @Override
    public void area() {
        System.out.println("矩形面积为：" + this.length * this.wide);
    }
}
