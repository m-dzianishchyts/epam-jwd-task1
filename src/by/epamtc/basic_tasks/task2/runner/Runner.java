package by.epamtc.basic_tasks.task2.runner;

import by.epamtc.basic_tasks.scanner.DataScanningUtils;
import by.epamtc.basic_tasks.task2.scanner.DateScanningUtils;
import by.epamtc.basic_tasks.task2.unit.DateUtils;
import by.epamtc.basic_tasks.task2.unit.InvalidDateException;
import by.epamtc.basic_tasks.task2.unit.Month;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter year: ");
        int year = DataScanningUtils.enterPositiveIntegerFromConsole();
        System.out.print("Enter month number: ");
        Month month = DateScanningUtils.enterMonthFromConsole();

        try {
            int daysInMonthAmount = DateUtils.retrieveDaysAmountInMonth(year, month);

            // Offset in month number because of elements numbering from 0.
            System.out.printf("Amount of days in %s of %d: %d\n", month.toString(), year, daysInMonthAmount);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }

    }
}
