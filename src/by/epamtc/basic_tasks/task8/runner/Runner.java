package by.epamtc.basic_tasks.task8.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task8.unit.SomeMathFunction;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter x: ");
        double x = DataScanner.enterDoubleFromConsole();
        double valueOfFunction = SomeMathFunction.valueAt(x);
        System.out.printf("F(%f) = %f\n", x, valueOfFunction);
    }
}
