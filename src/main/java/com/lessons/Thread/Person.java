package com.lessons.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person implements Runnable{

    public List<Integer> getArrayInt() {
        List<Integer> arrayInt = new ArrayList<Integer>();
        for (int i = 0; i < Ticket.ticketNumber; i++) {
            arrayInt.add(i + 1);
        }

        return arrayInt;
    }


    public synchronized void BuyTicket () throws InterruptedException {
        int personNum = 1;
        while (Ticket.ticketNumber > 0) {
            int RandomTicket = new Random().nextInt(1000) + 1;
            Integer soldTicket = getArrayInt().remove(RandomTicket);
            System.out.println("顾客" + personNum + "买到了" + "第" + soldTicket + "张票");
            Thread.sleep(500);
            personNum++;
            Ticket.ticketNumber--;
        }
    }

    public void run() {
        try {
            BuyTicket();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
