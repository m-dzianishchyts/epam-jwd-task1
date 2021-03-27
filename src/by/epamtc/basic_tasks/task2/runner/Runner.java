package by.epamtc.basic_tasks.task2.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task2.scanner.MonthScanner;
import by.epamtc.basic_tasks.task2.unit.DateLogics;
import by.epamtc.basic_tasks.task2.unit.Month;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter year: ");
        int year = DataScanner.enterPositiveIntegerFromConsole();
        System.out.print("Enter month number: ");
        Month month = MonthScanner.enterMonthFromConsole();

        int daysInMonthAmount = DateLogics.retrieveDaysAmountInMonth(year, month);

        // Offset in month number because of elements numbering from 0.
        System.out.printf("Amount of days in the %d month of %d: %d\n", month.ordinal() + 1, year, daysInMonthAmount);
    }
}
