package by.epamtc.basic_tasks.task2.scanner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task2.unit.Month;

public class DateScanner {

    public static int enterYearFromConsole() {
        int year;
        do {
            year = DataScanner.enterIntegerFromConsole();
        } while (year <= 0);
        return year;
    }

    public static Month enterMonthFromConsole() {
        int monthNumber;
        do {
            monthNumber = DataScanner.enterIntegerFromConsole();
        } while (monthNumber < 1 || monthNumber > 12);

        // Смещение из-за нумерации с нуля.
        return Month.values()[monthNumber - 1];
    }
}
