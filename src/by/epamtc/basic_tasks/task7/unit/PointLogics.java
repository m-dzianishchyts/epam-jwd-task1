package by.epamtc.basic_tasks.task7.unit;

public class PointLogics {

    public static Point nearestToZeroCenter(Point pointA, Point pointB) {
        if (pointA == null || pointB == null) {
            throw new IllegalArgumentException("Point cannot be null.");
        }
        Point zeroPoint = new Point(0, 0);
        double distanceA = calculateDistanceBetween(pointA, zeroPoint);
        double distanceB = calculateDistanceBetween(pointB, zeroPoint);

        Point nearestToZeroCenter;
        if (distanceA < distanceB) {
            nearestToZeroCenter = pointA;
        } else {
            nearestToZeroCenter = pointB;
        }
        return nearestToZeroCenter;
    }

    public static double calculateDistanceBetween(Point pointA, Point pointB) {
        double vectorX = pointB.getX() - pointA.getX();
        double vectorY = pointB.getY() - pointA.getY();
        double distance = Math.sqrt(vectorX * vectorX + vectorY * vectorY);
        return distance;
    }
}
