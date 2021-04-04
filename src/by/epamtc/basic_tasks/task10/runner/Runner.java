package by.epamtc.basic_tasks.task10.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task10.printer.FunctionValuesPrinter;
import by.epamtc.basic_tasks.task10.unit.InvalidIntervalException;
import by.epamtc.basic_tasks.task10.unit.TangentValuesLogics;

import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter value to compute from: ");
        double fromValue = DataScanner.enterDoubleFromConsole();
        System.out.print("Enter value to compute to: ");
        double toValue = DataScanner.enterDoubleFromConsole();
        System.out.print("Enter step: ");
        double step = DataScanner.enterPositiveDoubleFromConsole();

        try {
            Map<Double, Double> functionValues = TangentValuesLogics.computeTangentValues(fromValue, toValue, step);
            FunctionValuesPrinter.printValuesOf(functionValues);
        } catch (InvalidIntervalException e) {
            System.err.println(e.getMessage());
        }
    }
}
