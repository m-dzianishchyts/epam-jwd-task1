package by.epamtc.basic_tasks.task4.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task4.unit.EvenNumbersLogics;
import by.epamtc.basic_tasks.task4.unit.InvalidNumbersException;

public class Runner {

    public static void main(String[] args) {
        int[] enteredNumbers = new int[4];
        int i = 0;
        System.out.print("Enter 4 integer numbers: ");
        do {
            enteredNumbers[i] = DataScanner.enterIntegerFromConsole();
            i++;
            System.out.printf("Accepted %d number(s).\n", i);
        } while (i < enteredNumbers.length);

        boolean inputContainsAtLeastTwoEvenNumbers = false;
        try {
            inputContainsAtLeastTwoEvenNumbers = EvenNumbersLogics.areEvenAtLeastTwo(enteredNumbers);
        } catch (InvalidNumbersException e) {
            e.printStackTrace();
        }

        System.out.println("At least two of entered numbers are even: " + inputContainsAtLeastTwoEvenNumbers);
    }
}
