package by.epamtc.basic_tasks.task9.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task9.unit.CircleLogics;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        double radius = DataScanner.enterPositiveDoubleFromConsole();

        double perimeter = CircleLogics.calculatePerimeterByRadius(radius);
        double area = CircleLogics.calculateAreaByRadius(radius);
        System.out.println("Circle perimeter: " + perimeter);
        System.out.println("Circle area: " + area);
    }
}
