package com.lessons.Inherit;

public class NonMotor {
    private String brand;
    private String colour;

    private int wheel = 2;

    private int chair = 1;

    public NonMotor() {
    }

    public NonMotor(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }

    public NonMotor(String brand, String colour, int wheel, int chair) {
        this.brand = brand;
        this.colour = colour;
        this.wheel = wheel;
        this.chair = chair;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getChair() {
        return chair;
    }

    public void setChair(int chair) {
        this.chair = chair;
    }

    public String work() {
        String str = "父类信息测试：" + "这是一辆" + this.getColour() + "颜色的，" + this.getBrand() + "牌的非机动车，有" + this.getWheel() + "个轮子，有" + this.getChair() + "个座椅的非机动车。";
        return str;
    }
}
