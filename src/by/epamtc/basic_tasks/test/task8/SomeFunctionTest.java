package by.epamtc.basic_tasks.test.task8;

import by.epamtc.basic_tasks.function.NoFunctionValueException;
import by.epamtc.basic_tasks.task8.unit.SomeFunction;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SomeFunctionTest {

    @Test
    void valueAt() {
        Map<Double, Double> functionValues = new LinkedHashMap<>();
        for (double x : new double[]{Double.NEGATIVE_INFINITY, -10, -5, -2, 1, Math.pow(6, 1.0 / 3), 2, 3, 5, 10,
                                     Double.POSITIVE_INFINITY, Double.NaN}) {
            double functionValue;
            try {
                functionValue = SomeFunction.valueAt(x);
            } catch (NoFunctionValueException e) {
                functionValue = Double.NaN;
            }
            functionValues.put(x, functionValue);
        }

        assertEquals(0, functionValues.get(Double.NEGATIVE_INFINITY));
        assertEquals(-1.0 / 1006, functionValues.get(-10.0));
        assertEquals(-1.0 / 131, functionValues.get(-5.0));
        assertEquals(-1.0 / 14, functionValues.get(-2.0));
        assertEquals(-1.0 / 5, functionValues.get(1.0));
        assertEquals(Double.NaN, functionValues.get(Math.pow(6, 1.0 / 3)));
        assertEquals(1.0 / 2, functionValues.get(2.0));
        assertEquals(9, functionValues.get(3.0));
        assertEquals(-1, functionValues.get(5.0));
        assertEquals(-61, functionValues.get(10.0));
        assertEquals(Double.NEGATIVE_INFINITY, functionValues.get(Double.POSITIVE_INFINITY));
        assertEquals(Double.NaN, functionValues.get(Double.NaN));
    }
}