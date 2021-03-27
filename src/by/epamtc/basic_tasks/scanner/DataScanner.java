package by.epamtc.basic_tasks.scanner;

import java.util.Scanner;

public class DataScanner {

    private static final Scanner scanner = new Scanner(System.in);

    public static int enterIntegerFromConsole() {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }
}
