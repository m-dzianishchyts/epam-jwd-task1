package by.epamtc.basic_tasks.task8.runner;

import by.epamtc.basic_tasks.scanner.DataScanningUtils;
import by.epamtc.basic_tasks.task8.unit.SomeMathFunctionHelper;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter x: ");
        double x = DataScanningUtils.enterDoubleFromConsole();
        double valueOfFunction = SomeMathFunctionHelper.valueAt(x);
        System.out.printf("F(%f) = %f\n", x, valueOfFunction);
    }
}
