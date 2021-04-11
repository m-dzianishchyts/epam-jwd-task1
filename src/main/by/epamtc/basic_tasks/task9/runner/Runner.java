package by.epamtc.basic_tasks.task9.runner;

import by.epamtc.basic_tasks.scanner.DataScanningUtils;
import by.epamtc.basic_tasks.task9.unit.CircleUtils;
import by.epamtc.basic_tasks.task9.unit.InvalidCirclePropertyException;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        double radius = DataScanningUtils.enterDoubleFromConsole();

        try {
            double perimeter = CircleUtils.calculatePerimeterByRadius(radius);
            double area = CircleUtils.calculateAreaByRadius(radius);
            System.out.println("Circle perimeter: " + perimeter);
            System.out.println("Circle area: " + area);
        } catch (InvalidCirclePropertyException e) {
            System.err.println(e.getMessage());
        }
    }
}
