package com.lessons.singleton_pattern;

public class Emperor {
    private Emperor() {

    }

    private static Emperor emperor = null;

    public static Emperor getEmperor() {
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;

    }
}
