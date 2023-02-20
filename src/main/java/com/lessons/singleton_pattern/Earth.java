package com.lessons.singleton_pattern;

public class Earth {
    private Earth() {
        System.out.println("地球诞生");
    }

    private static Earth earth = new Earth();

    public static Earth getEarth() {
        return earth;
    }
}
