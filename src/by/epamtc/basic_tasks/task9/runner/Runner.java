package by.epamtc.basic_tasks.task9.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task9.unit.CircleLogics;
import by.epamtc.basic_tasks.task9.unit.InvalidCirclePropertyException;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        double radius = DataScanner.enterDoubleFromConsole();

        try {
            double perimeter = CircleLogics.calculatePerimeterByRadius(radius);
            double area = CircleLogics.calculateAreaByRadius(radius);
            System.out.println("Circle perimeter: " + perimeter);
            System.out.println("Circle area: " + area);
        } catch (InvalidCirclePropertyException e) {
            System.err.println(e.getMessage());
        }
    }
}
