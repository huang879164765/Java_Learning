package com.lessons.Thread;

public class Dog implements Runnable{
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "A dog");
        }

    }
}
