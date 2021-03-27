package by.epamtc.basic_tasks.task1.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task1.unit.LastDigitLogics;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter integer number: ");
        int number = DataScanner.enterIntegerFromConsole();

        int lastDigitOfSquare = LastDigitLogics.calculateLastDigitOfSquareOf(number);
        System.out.printf("Last digit of square of %d: %d\n", number, lastDigitOfSquare);
    }
}
