package com.lessons.Encapsulation;

public class Book {
    private String BookNmame;
    private String Writer;
    private double Price;
    private String Press;

    public Book() {
        System.out.println("图书价格最低10元");
    }

    public Book(String bookNmame, String writer, double price, String press) {
        BookNmame = bookNmame;
        Writer = writer;
        Price = this.setPrice(price);
        Press = press;
    }

    public String getBookNmame() {
        return BookNmame;
    }


    public String getWriter() {
        return Writer;
    }


    public double getPrice() {
        return Price;
    }

    public double setPrice(double price) {
        if (price < 10.0) {
            System.out.println("图书价格必须大于10.0元，");
            Price = 10.0;
        } else {
            Price = price;
        }
        return Price;
    }

    public String getPress() {
        return Press;
    }

    public void setPress(String press) {
        Press = press;
    }

    public void displayBook() {
        System.out.println("书名：" + this.getBookNmame());
        System.out.println("作者：" + this.getWriter());
        System.out.println("出版社：" + this.getPress());
        System.out.println("价格：" + this.getPrice());
    }
}
