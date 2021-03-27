package by.epamtc.basic_tasks.task2.runner;

import by.epamtc.basic_tasks.task2.scanner.DateScanner;
import by.epamtc.basic_tasks.task2.unit.DateLogics;
import by.epamtc.basic_tasks.task2.unit.Month;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Введите год: ");
        int year = DateScanner.enterYearFromConsole();
        System.out.print("Введите номер месяца: ");
        Month month = DateScanner.enterMonthFromConsole();

        int daysInMonthAmount = DateLogics.retrieveDaysAmountInMonth(year, month);

        // Смещение в номере месяца из-за нумерации с нуля.
        System.out.printf("Количество дней в %d месяце %d года: %d\n", month.ordinal() + 1, year, daysInMonthAmount);
    }
}
