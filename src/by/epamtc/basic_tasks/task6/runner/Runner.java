package by.epamtc.basic_tasks.task6.runner;

import by.epamtc.basic_tasks.scanner.DataScanningUtils;
import by.epamtc.basic_tasks.task6.unit.DayTime;
import by.epamtc.basic_tasks.task6.unit.InvalidTimeException;
import by.epamtc.basic_tasks.task6.unit.TimeUtils;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter current second: ");
        int currentSecond = DataScanningUtils.enterPositiveIntegerFromConsole();

        try {
            DayTime dayTime = TimeUtils.calculateDayTimeByCurrentSecond(currentSecond);
            System.out.printf("Day time is %02d:%02d:%02d\n", dayTime.getHours(), dayTime.getMinutes(), dayTime.getSeconds());
        } catch (InvalidTimeException e) {
            System.err.println(e.getMessage());
        }
    }
}
