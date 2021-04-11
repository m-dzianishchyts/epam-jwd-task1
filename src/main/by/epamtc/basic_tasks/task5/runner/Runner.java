package by.epamtc.basic_tasks.task5.runner;

import by.epamtc.basic_tasks.scanner.DataScanningUtils;
import by.epamtc.basic_tasks.task5.unit.PerfectNumbersUtils;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter integer number: ");
        long number = DataScanningUtils.enterLongFromConsole();

        boolean isNumberPerfect = PerfectNumbersUtils.isPerfect(number);
        System.out.printf("Number %d is perfect: %b\n", number, isNumberPerfect);
    }
}
