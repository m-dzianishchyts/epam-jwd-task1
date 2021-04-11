package by.epamtc.basic_tasks.task10.unit;

import java.util.LinkedHashMap;
import java.util.Map;

public final class TangentValuesLogics {

    private TangentValuesLogics() {
    }

    public static Map<Double, Double> computeTangentValues(double fromValue, double toValue, double step)
            throws InvalidIntervalException {
        if (!Double.isFinite(fromValue) || !Double.isFinite(toValue) || toValue < fromValue) {
            throw new InvalidIntervalException("Invalid interval.");
        }
        if (step <= 0) {
            throw new InvalidIntervalException("Step must be positive.");
        }
        Map<Double, Double> tangentValues = new LinkedHashMap<>();
        for (double x = fromValue; x <= toValue; x += step) {
            double tangentValue = Tangent.valueAt(x);
            tangentValues.put(x, tangentValue);
        }
        return tangentValues;
    }
}
