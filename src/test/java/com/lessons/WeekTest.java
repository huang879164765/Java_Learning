package com.lessons;
public class WeekTest {

    public enum WeekDay {
        SUNDAY, MONDAY, TUESDAY, WEDNESTDAY, THURSDAY, FRIDAY, SATURDAY
    };
    public static void main(String[] args) {
        System.out.println(WeekDay.MONDAY);
        WeekDay weekDay = WeekDay.TUESDAY;
        if (weekDay == WeekDay.FRIDAY) {
            System.out.println("周末快到了");
        }
    }
}
