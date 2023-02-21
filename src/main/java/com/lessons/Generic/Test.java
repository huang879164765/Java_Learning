package com.lessons.Generic;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal one = new Cat("花花", "小猫");
        Animal two = new Cat("凡凡", "小猫");
        Animal three = new Cat("巴迪", "小狗");
        Animal four = new Cat("豆豆", "小狗");
        List<Animal> list = new ArrayList<Animal>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        AnimalPlay animalPlay = new AnimalPlay();
        animalPlay.display(list);
    }




}
