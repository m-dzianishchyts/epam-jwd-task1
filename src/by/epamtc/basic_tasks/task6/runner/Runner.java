package by.epamtc.basic_tasks.task6.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task6.unit.DayTime;
import by.epamtc.basic_tasks.task6.unit.TimeLogics;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter current second: ");
        int currentSecond = DataScanner.enterPositiveIntegerFromConsole();

        DayTime dayTime = TimeLogics.calculateDayTimeByCurrentSecond(currentSecond);
        System.out.printf("Day time is %02d:%02d:%02d\n", dayTime.getHours(), dayTime.getMinutes(), dayTime.getSeconds());
    }
}
