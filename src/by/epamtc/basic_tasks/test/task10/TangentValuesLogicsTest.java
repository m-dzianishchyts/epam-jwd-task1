package by.epamtc.basic_tasks.test.task10;

import by.epamtc.basic_tasks.task10.unit.TangentValuesLogics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TangentValuesLogicsTest {

    private static final double NEAR_ZERO = 1E-15;
    private static final double NEAR_POSITIVE_INFINITY = 1E15;
    private static final double NEAR_NEGATIVE_INFINITY = -1E15;

    @Test
    void tan() {
        assertEquals(0, TangentValuesLogics.tan(0), NEAR_ZERO);
        assertEquals( 0, TangentValuesLogics.tan(Math.PI), NEAR_ZERO);
        assertEquals(0, TangentValuesLogics.tan(Math.PI), NEAR_ZERO);
        assertEquals(1, TangentValuesLogics.tan(Math.PI / 4), NEAR_ZERO);
        assertEquals(-1, TangentValuesLogics.tan(-Math.PI / 4), NEAR_ZERO);
        assertTrue(TangentValuesLogics.tan(Math.PI / 2) > NEAR_POSITIVE_INFINITY);
        assertTrue(TangentValuesLogics.tan(-Math.PI / 2) < NEAR_NEGATIVE_INFINITY);
    }
}