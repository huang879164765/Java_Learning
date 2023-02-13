package com.lessons.Encapsulation;

public class BookTest {
    public static void main(String[] args) {
        Book one, two;
        one = new Book("红楼梦", "曹雪芹", 3.6, "中国人民文学出版社");
        one.displayBook();
        System.out.println("===================================");
        two = new Book("小李飞刀", "古龙", 55.5, "中国长安出版社");
        two.displayBook();
    }
}
