package com.lessons.String;

public class StringTest {
    public static void main(String[] args) {
        //定义一个字符串"欢迎来到"
        StringBuilder str = new StringBuilder("欢迎来到");
        System.out.println(str);
        //在"欢迎来到"后面添加内容，将字符串变成"欢迎来到imooc"
        str.append("imooc");
        System.out.println(str);
        //使用delete方法删除"欢迎来到",然后插入“你好！”
        str.delete(0, 4);
        System.out.println(str);
        //将字符串变成“你好，imooc”
        str.insert(0, "你好，");
        System.out.println(str);
        //使用replace方法替换
        str.replace(0, 3, "欢迎来到");
        System.out.println(str);
    }
}
