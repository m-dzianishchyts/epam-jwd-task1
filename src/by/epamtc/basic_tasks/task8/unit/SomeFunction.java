package by.epamtc.basic_tasks.task8.unit;

public class SomeFunction {

    private static final Function functionOptionA = x -> {
        double value;
        if (Double.isInfinite(x) || Double.isNaN(x)) {
            value = -x;
        } else {
            value = -x * x + 3 * x + 9;
        }
        return value;
    };

    private static final Function functionOptionB = x -> {
        double value;
        if (Double.isInfinite(x)) {
            value = 0;
        } else if (Double.isNaN(x)) {
            value = Double.NaN;
        } else if (x == Math.pow(6, 1.0 / 3)) {
            throw new NoFunctionValueException("Division by zero.");
        } else {
            value = 1 / (x * x * x - 6);
        }
        return value;
    };

    public static double valueAt(double x) throws NoFunctionValueException {
        double value;
        if (x >= 3) {
            value = functionOptionA.valueAt(x);
        } else {
            value = functionOptionB.valueAt(x);
        }
        return value;
    }
}
