package by.epamtc.basic_tasks.task10.unit;

import by.epamtc.basic_tasks.function.Function;
import by.epamtc.basic_tasks.function.NoFunctionValueException;

import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionValuesLogics {

    private static final Function function = Math::tan;

    public static Map<Double, Double> computeFunctionValues(double fromValue, double toValue, double step) {
        if (toValue < fromValue) {
            throw new IllegalArgumentException("Invalid interval.");
        }
        if (step <= 0) {
            throw new IllegalArgumentException("Step must be positive.");
        }
        Map<Double, Double> functionValues = new LinkedHashMap<>();
        for (double x = fromValue; x < toValue; x += step) {
            double functionValue;
            try {
                functionValue = function.valueAt(x);
            } catch (NoFunctionValueException e) {
                functionValue = Double.NaN;
            }
            functionValues.put(x, functionValue);
        }
        return functionValues;
    }
}
