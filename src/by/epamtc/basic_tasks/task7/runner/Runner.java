package by.epamtc.basic_tasks.task7.runner;

import by.epamtc.basic_tasks.scanner.DataScanner;
import by.epamtc.basic_tasks.task7.unit.InvalidCircleException;
import by.epamtc.basic_tasks.task7.unit.InvalidCoordinateException;
import by.epamtc.basic_tasks.task7.unit.Point;
import by.epamtc.basic_tasks.task7.unit.PointLogics;

public class Runner {

    public static void main(String[] args) {
        Point pointA = null;
        Point pointB = null;

        try {
            pointA = new Point(0, 0);
            pointB = new Point(0, 0);
        } catch (InvalidCoordinateException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        setCoordinateX(pointA);
        setCoordinateY(pointA);
        System.out.println("Point A was accepted.");
        setCoordinateX(pointB);
        setCoordinateY(pointB);
        System.out.println("Point B was accepted.");

        try {
            Point nearestToZeroCenter = PointLogics.nearestToZeroCenter(pointA, pointB);
            System.out.printf("Nearest point is %s: %s\n", nearestToZeroCenter == pointA ? "A" : "B",
                              nearestToZeroCenter);
        } catch (InvalidCircleException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void setCoordinateX(Point point) {
        while (true) {
            try {
                System.out.print("Enter x for point: ");
                double x = DataScanner.enterDoubleFromConsole();
                point.setX(x);
                break;
            } catch (InvalidCoordinateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void setCoordinateY(Point point) {
        while (true) {
            try {
                System.out.print("Enter y for point: ");
                double y = DataScanner.enterDoubleFromConsole();
                point.setY(y);
                break;
            } catch (InvalidCoordinateException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
