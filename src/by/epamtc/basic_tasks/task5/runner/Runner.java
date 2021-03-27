package by.epamtc.basic_tasks.task5.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task5.unit.PerfectNumbersLogics;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter integer number: ");
        long number = DataScanner.enterLongFromConsole();

        boolean isNumberPerfect = PerfectNumbersLogics.isPerfect(number);
        System.out.printf("Number %d is perfect: %b\n", number, isNumberPerfect);
    }
}
