package com.lessons.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BuyTicketTest {

    public void startTest() {
        Person person = new Person();
        Thread thread1 = new Thread(person);
        Thread thread2 = new Thread(person);
        Thread thread3 = new Thread(person);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);
        executorService.shutdown();

    }

    public static void main(String[] args) {
        BuyTicketTest buyTicketTest = new BuyTicketTest();
        buyTicketTest.startTest();

    }
}
