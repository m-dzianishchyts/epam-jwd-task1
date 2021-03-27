package by.epamtc.basic_tasks.task3.unit;

public class InscribedShapesLogics {

    public static double calculateSideLengthOfSquareInscribedInCircle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        return radius * Math.sqrt(2);
    }

    public static double calculateRadiusOfCircleInscribedInSquare(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Square's side length must be positive.");
        }
        return sideLength / 2;
    }
}
