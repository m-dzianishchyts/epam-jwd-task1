package by.epamtc.basic_tasks.task7.unit;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) throws InvalidCoordinateException {
        checkCoordinate(x);
        checkCoordinate(y);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@(" + x + "; " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point other = (Point) o;
        boolean equals = Double.compare(other.x, x) == 0 && Double.compare(other.y, y) == 0;
        return equals;
    }

    @Override
    public int hashCode() {
        long xLongBits = Double.doubleToLongBits(x);
        long yLongBits = Double.doubleToLongBits(y);
        int hashCode = (int) (xLongBits ^ (xLongBits >>> 32));
        hashCode = (int) (31 * hashCode + (yLongBits ^ (yLongBits >>> 32)));
        return hashCode;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) throws InvalidCoordinateException {
        checkCoordinate(x);
        this.x = x;
    }

    public void setY(double y) throws InvalidCoordinateException {
        checkCoordinate(y);
        this.y = y;
    }

    private void checkCoordinate(double coordinate) throws InvalidCoordinateException {
        if (Double.isNaN(coordinate)) {
            throw new InvalidCoordinateException("Coordinate cannot be NaN.");
        }
    }
}
