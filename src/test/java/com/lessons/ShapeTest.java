package com.lessons;

import com.lessons.Polymorphism.Circle;
import com.lessons.Polymorphism.Rectangle;
import com.lessons.Polymorphism.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape one = new Rectangle(34, 45);
        Shape two = new Circle(5);
        one.area();
        two.area();
    }

}
