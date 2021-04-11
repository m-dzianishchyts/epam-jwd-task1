package by.epamtc.basic_tasks.task10;

import by.epamtc.basic_tasks.task10.unit.Tangent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TangentTest {

    private static final double NEAR_ZERO = 1E-15;

    @Test
    void tan() {
        assertEquals(0, Tangent.valueAt(0));
        assertEquals(0, Tangent.valueAt(Math.PI));
        assertEquals(0, Tangent.valueAt(-Math.PI));
        assertEquals(1, Tangent.valueAt(Math.PI / 4), NEAR_ZERO);
        assertEquals(-1, Tangent.valueAt(-Math.PI / 4), NEAR_ZERO);
        assertEquals(Double.NaN, Tangent.valueAt(Math.PI / 2));
        assertEquals(Double.NaN, Tangent.valueAt(-Math.PI / 2));
        assertEquals(Double.NaN, Tangent.valueAt(Double.NaN));
        assertEquals(Double.NaN, Tangent.valueAt(Double.POSITIVE_INFINITY));
        assertEquals(Double.NaN, Tangent.valueAt(Double.NEGATIVE_INFINITY));
    }
}