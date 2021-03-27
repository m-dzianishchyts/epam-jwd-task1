package by.epamtc.basic_tasks.scanner;

import java.util.Scanner;

public class DataScanner {

    private static final Scanner scanner = new Scanner(System.in);

    public static int enterIntegerFromConsole() {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int number = scanner.nextInt();
        return number;
    }

    public static int enterPositiveIntegerFromConsole() {
        int number;
        do {
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

    public static long enterLongFromConsole() {
        while (!scanner.hasNextLong()) {
            scanner.next();
        }
        long number = scanner.nextLong();
        return number;
    }

    public static double enterDoubleFromConsole() {
        while (!scanner.hasNextDouble()) {
            scanner.next();
        }
        double number = scanner.nextDouble();
        return number;
    }

    public static double enterPositiveDoubleFromConsole() {
        double number;
        do {
            while (!scanner.hasNextDouble()) {
                scanner.next();
            }
            number = scanner.nextDouble();
        } while (number <= 0);
        return number;
    }
}
