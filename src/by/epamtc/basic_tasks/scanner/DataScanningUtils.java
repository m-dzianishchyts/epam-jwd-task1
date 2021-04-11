package by.epamtc.basic_tasks.scanner;

import java.util.Scanner;

public class DataScanningUtils {

    private DataScanningUtils() {
    }

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int enterIntegerFromConsole() {
        while (!SCANNER.hasNextInt()) {
            SCANNER.next();
        }
        int number = SCANNER.nextInt();
        return number;
    }

    public static int enterPositiveIntegerFromConsole() {
        int number;
        do {
            while (!SCANNER.hasNextInt()) {
                SCANNER.next();
            }
            number = SCANNER.nextInt();
        } while (number <= 0);
        return number;
    }

    public static long enterLongFromConsole() {
        while (!SCANNER.hasNextLong()) {
            SCANNER.next();
        }
        long number = SCANNER.nextLong();
        return number;
    }

    public static double enterDoubleFromConsole() {
        while (!SCANNER.hasNextDouble()) {
            SCANNER.next();
        }
        double number = SCANNER.nextDouble();
        return number;
    }

    public static double enterPositiveDoubleFromConsole() {
        double number;
        do {
            while (!SCANNER.hasNextDouble()) {
                SCANNER.next();
            }
            number = SCANNER.nextDouble();
        } while (number <= 0);
        return number;
    }
}
