package by.epamtc.basic_tasks.task10.unit;

import java.util.LinkedHashMap;
import java.util.Map;

public class TangentValuesLogics {

    public static Map<Double, Double> computeTangentValues(double fromValue, double toValue, double step)
            throws InvalidIntervalException {
        if (toValue < fromValue) {
            throw new InvalidIntervalException("Invalid interval.");
        }
        if (step <= 0) {
            throw new InvalidIntervalException("Step must be positive.");
        }
        Map<Double, Double> functionValues = new LinkedHashMap<>();
        for (double x = fromValue; x < toValue; x += step) {
            double functionValue = Tangent.valueAt(x);
            functionValues.put(x, functionValue);
        }
        return functionValues;
    }
}
