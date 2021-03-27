package by.epamtc.basic_tasks.task1.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task1.unit.LastDigitLogics;

public class Runner {

    public static void main(String[] args) {
        int number;
        System.out.print("Введите целое число: ");
        number = DataScanner.enterIntegerFromConsole();

        int lastDigitOfSquare;
        lastDigitOfSquare = LastDigitLogics.calculateLastDigitOfSquareOf(number);
        System.out.printf("Последняя цифра квадрата числа %d: %d\n", number, lastDigitOfSquare);
    }
}
