package com.lessons.Object_Oriented;

public class Monkey {
    String name = "长尾猴";
    String feature = "尾巴长";

    public Monkey() {
        System.out.println("我是使用无参构造产生的猴子：");
        System.out.println("名称：" + this.name);
        System.out.println("特征：" + this.feature);
    }

    public Monkey(String name, String feature) {
        this.name = name;
        this.feature = feature;

        System.out.println("我是使用带参构造产生的猴子：");
        System.out.println("名称：" + this.name);
        System.out.println("特征：" + this.feature);
    }


}
