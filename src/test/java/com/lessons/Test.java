package com.lessons;

import com.lessons.Inherit.Bicycle;
import com.lessons.Inherit.ElectricVehicle;
import com.lessons.Inherit.NonMotor;
import com.lessons.Inherit.Tricycle;
import com.lessons.Polymorphism.Ball;
import com.lessons.Polymorphism.BallTest;
import com.lessons.singleton_pattern.Earth;
import com.lessons.singleton_pattern.Emperor;

public class Test {
    public static void main(String[] args) {
//        NonMotor one = new NonMotor("天宇", "红", 4, 2);
//        System.out.println(one.work());
//
//        Bicycle two = new Bicycle("捷安特", "黄");
//        System.out.println(two.work());
//
//        ElectricVehicle three = new ElectricVehicle("飞鸽");
//        System.out.println(three.work());
//
//        Tricycle four = new Tricycle();
//        System.out.println(four.work());

//        System.out.println("第一个地球创建中。。。。");
//        Earth earth1 = Earth.getEarth();
//        System.out.println("第二个地球创建中。。。。");
//
//        System.out.println("第三个地球创建中。。。。");
//
//        System.out.println("问：三个地球是同一个么？");
//        System.out.println(earth1);
//        System.out.println(Earth.getEarth());
//        System.out.println(Earth.getEarth());

//        System.out.println("创建1号皇帝对象");
//
//        System.out.println("创建2号皇帝对象");
//
//        System.out.println("创建3号皇帝对象");
//
//        System.out.println("三个皇帝对象依次是：");
//
//        System.out.println(Emperor.getEmperor());
//        System.out.println(Emperor.getEmperor());
//        System.out.println(Emperor.getEmperor());
        BallTest ballTest = new BallTest();
        BallTest.Inner_m innerM = ballTest.new Inner_m();
        innerM.play();
    }
}
