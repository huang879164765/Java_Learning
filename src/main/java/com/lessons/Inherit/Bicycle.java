package com.lessons.Inherit;

public class Bicycle extends NonMotor{
    public Bicycle() {
    }

    public Bicycle(String brand, String colour) {
        super(brand, colour);
    }

    @Override
    public String work() {
        String str = "自行车类信息测试：" + "这是一辆" + this.getColour() + "颜色的，" + this.getBrand() + "牌的自行车。";
        return str;
    }
}
