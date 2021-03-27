package by.epamtc.basic_tasks.task7.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task7.unit.Point;
import by.epamtc.basic_tasks.task7.unit.PointLogics;

public class Runner {

    public static void main(String[] args) {
        double x;
        double y;
        System.out.print("Enter x for point A: ");
        x = DataScanner.enterDoubleFromConsole();
        System.out.print("Enter y for point A: ");
        y = DataScanner.enterDoubleFromConsole();
        Point pointA = new Point(x, y);

        System.out.print("Enter x for point B: ");
        x = DataScanner.enterDoubleFromConsole();
        System.out.print("Enter y for point B: ");
        y = DataScanner.enterDoubleFromConsole();
        Point pointB = new Point(x, y);

        Point nearestToZeroCenter = PointLogics.nearestToZeroCenter(pointA, pointB);
        System.out.printf("Nearest point is %s: %s\n", nearestToZeroCenter == pointA ? "A" : "B", nearestToZeroCenter);
    }
}
