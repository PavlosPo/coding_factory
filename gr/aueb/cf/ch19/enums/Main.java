package gr.aueb.cf.ch19.enums;

public class Main {

    public static void main(String[] args) {
        WeekDay weekDays;

        // Values of Enum, NOT Enum Instance.
        for (WeekDay weekDay : WeekDay.values()) {
            System.out.println(weekDay.getDay());
        }
    }
}
