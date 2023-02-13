package com.lessons.Encapsulation;

class CodeBlock {
    {
        System.out.println("产生CodeBlock类实例对象");
        System.out.println("CodeBlock的构造块");
    }

    static {
        System.out.println("CodeBlock的静态代码块");
        System.out.println("ColdBlock的主方法");
    }

    public CodeBlock() {
        System.out.println("CodeBlock的构造方法");
    }

    public static void main(String[] args) {
        CodeBlock codeBlock = new CodeBlock();
        Code code = new Code();
        CodeBlock codeBlock1 = new CodeBlock();
    }
}
