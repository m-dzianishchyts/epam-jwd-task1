package by.epamtc.basic_tasks.task2.scanner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task2.unit.Month;

public class MonthScanner {

    public static Month enterMonthFromConsole() {
        int monthNumber;
        do {
            monthNumber = DataScanner.enterIntegerFromConsole();
        } while (monthNumber < 1 || monthNumber > 12);

        // Offset because of numerating elements from 0.
        return Month.values()[monthNumber - 1];
    }
}
