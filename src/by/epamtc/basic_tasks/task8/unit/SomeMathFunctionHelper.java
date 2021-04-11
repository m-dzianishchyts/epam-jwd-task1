package by.epamtc.basic_tasks.task8.unit;

public final class SomeMathFunctionHelper {

    private SomeMathFunctionHelper() {
    }

    private static final double FUNCTION_DEFINITION_BORDER = 3;

    private static final MathFunction FUNCTION_OPTION_A = x -> {
        double value;
        if (Double.isInfinite(x) || Double.isNaN(x)) {
            value = -x;
        } else {
            value = -x * x + 3 * x + 9;
        }
        return value;
    };

    private static final MathFunction FUNCTION_OPTION_B = new MathFunction() {

        // Function is undefined in 6^(1/3).
        private final double pointOfDiscontinuity = Math.pow(6, 1.0 / 3);

        @Override
        public double valueAt(double x) {
            double value;
            if (Double.isInfinite(x)) {
                value = 0;
            } else if (Double.isNaN(x) || x == pointOfDiscontinuity) {
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
            value = FUNCTION_OPTION_A.valueAt(x);
        } else {
            value = FUNCTION_OPTION_B.valueAt(x);
        }
        return value;
    }
}
