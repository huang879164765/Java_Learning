package com.lessons;

import com.lessons.Polymorphism.Get_Prize;
import com.lessons.Polymorphism.Milk_Tea;

import java.util.Random;

public class Milk_Tea_Test {
    public static void main(String[] args) {
        Milk_Tea[] Like_List = new Get_Prize[10];
        for (int i = 0; i < Like_List.length; i++) {
            int num = new Random().nextInt(201);
            Like_List[i] = new Get_Prize(num);
        }

        for (Milk_Tea milkTea : Like_List) {
            milkTea.send_milk_tea();
        }
    }
}
