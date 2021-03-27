package by.epamtc.basic_tasks.task9.unit;

public class CircleLogics {

    public static double calculatePerimeterByRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Circle radius cannot be negative.");
        }
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public static double calculateAreaByRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Circle radius cannot be negative.");
        }
        double area = Math.PI * radius * radius;
        return area;
    }
}
