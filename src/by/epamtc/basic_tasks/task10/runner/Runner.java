package by.epamtc.basic_tasks.task10.runner;

import by.epamtc.basic_tasks.scanner.DataScanningUtils;
import by.epamtc.basic_tasks.task10.printer.FunctionValuesPrintingUtils;
import by.epamtc.basic_tasks.task10.unit.InvalidIntervalException;
import by.epamtc.basic_tasks.task10.unit.TangentValuesUtils;

import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter value to compute from: ");
        double fromValue = DataScanningUtils.enterDoubleFromConsole();
        System.out.print("Enter value to compute to: ");
        double toValue = DataScanningUtils.enterDoubleFromConsole();
        System.out.print("Enter step: ");
        double step = DataScanningUtils.enterPositiveDoubleFromConsole();

        try {
            Map<Double, Double> functionValues = TangentValuesUtils.computeTangentValues(fromValue, toValue, step);
            FunctionValuesPrintingUtils.printValuesOf(functionValues);
        } catch (InvalidIntervalException e) {
            System.err.println(e.getMessage());
        }
    }
}
