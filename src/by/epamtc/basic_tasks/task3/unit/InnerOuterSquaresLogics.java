package by.epamtc.basic_tasks.task3.unit;

/* The inner and outer squares are connected by a circle.
 * The circle is inscribed in the outer square,
 * and the inner square is inscribed in this circle.
 */
public class InnerOuterSquaresLogics {

    public static double calculateInnerSquareAreaByOuterSquareArea(double outerSquareArea) {
        if (outerSquareArea <= 0) {
            throw new IllegalArgumentException("Area must be positive");
        }
        double outerSquareSideLength = SquareLogics.calculateSquareSideLengthByArea(outerSquareArea);
        double circleRadius = InscribedShapesLogics.calculateRadiusOfCircleInscribedInSquare(outerSquareSideLength);

        double innerSquareSideLength = InscribedShapesLogics.calculateSideLengthOfSquareInscribedInCircle(circleRadius);
        return SquareLogics.calculateSquareAreaBySideLength(innerSquareSideLength);
    }
}
