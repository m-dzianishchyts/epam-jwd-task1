package by.epamtc.basic_tasks.task7.unit;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
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
}
