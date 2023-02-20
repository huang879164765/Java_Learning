package com.lessons.Inherit;

public class ElectricVehicle extends NonMotor{

    private String ElectricBrand;
    public ElectricVehicle() {
    }

    public ElectricVehicle(String ElectricBrand) {
        this.ElectricBrand = ElectricBrand;
    }

    public String getElectricBrand() {
        return ElectricBrand;
    }

    public void setElectricBrand(String electricBrand) {
        ElectricBrand = electricBrand;
    }

    @Override
    public String work() {
        String str = "电动车类信息测试：" + "这是一辆使用" + this.getElectricBrand() +"牌电池的电动车。";
        return str;
    }
}
