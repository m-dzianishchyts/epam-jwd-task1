package by.epamtc.basic_tasks.task10.unit;

public class Tangent {

    private Tangent() {
    }

    public static double valueAt(double x) {

        // Tan is undefined in NaN, +infinity and -infinity.
        if (Double.isNaN(x) || Double.isInfinite(x)) {
            return Double.NaN;
        }

        double timesHalfPI = x / (Math.PI / 2);
        double timesPI = x / (Math.PI);

        // Tan is 0 in -pi, 0, pi, 2pi and so on.
        if (timesPI == Math.floor(timesPI)) {
            return 0;
        }

        // Tan is undefined in -pi/2, pi/2, 3pi/2, 5pi/2 and so on.
        if (timesHalfPI == Math.floor(timesHalfPI)) {
            return Double.NaN;
        }
        return Math.tan(x);
    }
}
