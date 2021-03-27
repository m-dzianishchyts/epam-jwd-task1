package by.epamtc.basic_tasks.task8.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task8.unit.NoFunctionValueException;
import by.epamtc.basic_tasks.task8.unit.SomeFunction;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter x as double: ");
        double x = DataScanner.enterDoubleFromConsole();

        double valueOfFunction;
        try {
            valueOfFunction = SomeFunction.valueAt(x);
        } catch (NoFunctionValueException e) {
            valueOfFunction = Double.NaN;
        }
        System.out.printf("F(%f) = %f\n", x, valueOfFunction);
    }
}
