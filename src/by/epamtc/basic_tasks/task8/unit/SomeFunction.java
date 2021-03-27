package by.epamtc.basic_tasks.task8.unit;

public class SomeFunction {

    private static final Function functionOptionA = x -> -x * x + 3 * x + 9;
    private static final Function functionOptionB = x -> {
        if (x == Math.pow(6, 1.0 / 3)) {
            throw new NoFunctionValueException("Division by zero.");
        }
        return 1 / (x * x * x - 6);
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
