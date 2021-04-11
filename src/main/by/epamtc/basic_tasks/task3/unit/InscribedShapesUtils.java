package by.epamtc.basic_tasks.task3.unit;

public class InscribedShapesUtils {

    private InscribedShapesUtils() {
    }

    public static double calculateSideLengthOfSquareInscribedInCircle(double radius)
            throws InvalidShapePropertyException {
        if (radius <= 0) {
            throw new InvalidShapePropertyException("Radius must be positive.");
        }
        double squareSideLength = radius * Math.sqrt(2);
        return squareSideLength;
    }

    public static double calculateRadiusOfCircleInscribedInSquare(double sideLength)
            throws InvalidShapePropertyException {
        if (sideLength <= 0) {
            throw new InvalidShapePropertyException("Square's side length must be positive.");
        }
        double radius = sideLength / 2;
        return radius;
    }
}
