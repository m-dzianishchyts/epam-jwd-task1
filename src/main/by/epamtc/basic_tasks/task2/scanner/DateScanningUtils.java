package by.epamtc.basic_tasks.task2.scanner;

import by.epamtc.basic_tasks.scanner.DataScanningUtils;
import by.epamtc.basic_tasks.task2.unit.Month;

public final class DateScanningUtils {

    private DateScanningUtils() {
    }

    public static Month enterMonthFromConsole() {
        int monthNumber;
        do {
            monthNumber = DataScanningUtils.enterIntegerFromConsole();
        } while (monthNumber < 1 || monthNumber > Month.values().length);

        // Offset because of numerating elements from 0.
        Month enteredMonth = Month.values()[monthNumber - 1];
        return enteredMonth;
    }
}
