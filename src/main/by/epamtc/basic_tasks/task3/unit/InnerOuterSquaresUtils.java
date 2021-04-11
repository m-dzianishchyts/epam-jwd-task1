package by.epamtc.basic_tasks.task3.unit;

/* The inner and outer squares are connected by a circle.
 * The circle is inscribed in the outer square,
 * and the inner square is inscribed in this circle.
 */
public final class InnerOuterSquaresUtils {

    private InnerOuterSquaresUtils() {
    }

    public static double calculateInnerSquareAreaByOuterSquareArea(double outerSquareArea)
            throws InvalidShapePropertyException {
        if (outerSquareArea <= 0) {
            throw new InvalidShapePropertyException("Area must be positive");
        }
        double outerSquareSideLength = SquareUtils.calculateSquareSideLengthByArea(outerSquareArea);
        double circleRadius = InscribedShapesUtils.calculateRadiusOfCircleInscribedInSquare(outerSquareSideLength);

        double innerSquareSideLength = InscribedShapesUtils.calculateSideLengthOfSquareInscribedInCircle(circleRadius);
        double innerSquareArea = SquareUtils.calculateSquareAreaBySideLength(innerSquareSideLength);
        return innerSquareArea;
    }
}
