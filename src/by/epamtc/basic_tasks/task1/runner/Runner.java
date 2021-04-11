package by.epamtc.basic_tasks.task1.runner;

import by.epamtc.basic_tasks.scanner.DataScanningUtils;
import by.epamtc.basic_tasks.task1.unit.LastDigitUtils;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter integer number: ");
        int number = DataScanningUtils.enterIntegerFromConsole();

        int lastDigitOfSquare = LastDigitUtils.calculateLastDigitOfSquareOf(number);
        System.out.printf("Last digit of square of %d: %d\n", number, lastDigitOfSquare);
    }
}
