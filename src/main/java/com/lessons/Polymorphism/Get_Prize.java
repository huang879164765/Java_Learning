package com.lessons.Polymorphism;

public class Get_Prize extends Milk_Tea{
    private int Like_Number;

    public Get_Prize() {
    }

    public Get_Prize(int like_Number) {
        Like_Number = like_Number;
    }

    public int getLike_Number() {
        return Like_Number;
    }

    public void setLike_Number(int like_Number) {
        Like_Number = like_Number;
    }

    @Override
    public void send_milk_tea() {
        if (this.Like_Number >= 100) {
            System.out.println("积攒100个，送一杯乌龙玛奇朵加波霸加仙草加冰淇淋。");
        } else if (this.Like_Number >= 80) {
            System.out.println("积攒80个，送一杯波霸奶茶加冰淇淋加奶霜。");
        } else if (this.Like_Number >= 60) {
            System.out.println("积攒60个，送一杯珍珠奶茶。");
        } else {
            System.out.println("积攒不够60个，无法领取奶茶。");
        }
    }
}
