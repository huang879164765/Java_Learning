package com.lessons.Thread;

public class ThreadTest extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(this.getName() + "打印机正在打印" + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
