package by.epamtc.basic_tasks.task3.unit;

public class SquareLogics {

    public static double calculateSquareSideLengthByArea(double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Area must be positive");
        }
        return Math.sqrt(area);
    }

    public static double calculateSquareAreaBySideLength(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Square's side length must be positive.");
        }
        return sideLength * sideLength;
    }
}
