package by.epamtc.basic_tasks.task7.unit;

public class PointLogics {

    public static Point nearestToZeroCenter(Point pointA, Point pointB) throws InvalidCircleException {
        if (pointA == null || pointB == null) {
            throw new InvalidCircleException("Point cannot be null.");
        }
        Point zeroPoint = null;
        try {
            zeroPoint = new Point(0, 0);
        } catch (InvalidCoordinateException e) {
            e.printStackTrace();
            System.exit(-1);
        }
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

    public static double calculateDistanceBetween(Point pointA, Point pointB) throws InvalidCircleException {
        if (pointA == null || pointB == null) {
            throw new InvalidCircleException("Point cannot be null.");
        }
        double distanceX = pointB.getX() - pointA.getX();
        double distanceY = pointB.getY() - pointA.getY();
        double distance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
        return distance;
    }
}
