package com.lessons.Encapsulation;

class Code {
    {
        System.out.println("Code的构造块");
    }

    static {
        System.out.println("产生Code类实例对象");
        System.out.println("Code的静态代码块");
    }

    public Code() {
        System.out.println("Code的构造方法");
    }
}
