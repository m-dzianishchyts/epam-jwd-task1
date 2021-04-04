package by.epamtc.basic_tasks.task8.unit;

public class SomeMathFunction {

    private static final double FUNCTION_DEFINITION_BORDER = 3;

    private static final MathFunction functionOptionA = x -> {
        double value;
        if (Double.isInfinite(x) || Double.isNaN(x)) {
            value = -x;
        } else {
            value = -x * x + 3 * x + 9;
        }
        return value;
    };

    private static final MathFunction functionOptionB = new MathFunction() {

        // Function is undefined in 6^(1/3).
        private final double POINT_OF_DISCONTINUITY = Math.pow(6, 1.0 / 3);

        @Override
        public double valueAt(double x) {
            double value;
            if (Double.isInfinite(x)) {
                value = 0;
            } else if (Double.isNaN(x) || x == POINT_OF_DISCONTINUITY) {
                value = Double.NaN;
            } else {
                value = 1 / (x * x * x - 6);
            }
            return value;
        }
    };

    public static double valueAt(double x) {
        double value;
        if (x >= FUNCTION_DEFINITION_BORDER) {
            value = functionOptionA.valueAt(x);
        } else {
            value = functionOptionB.valueAt(x);
        }
        return value;
    }
}
