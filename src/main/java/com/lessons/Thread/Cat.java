package com.lessons.Thread;

public class Cat implements Runnable{
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "A cat");
        }

    }
}
