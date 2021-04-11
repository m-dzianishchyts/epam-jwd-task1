package by.epamtc.basic_tasks.task10;

import by.epamtc.basic_tasks.task10.unit.Tangent;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TangentTest {

    private static final double NEAR_ZERO = 1E-15;

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI, -Math.PI})
    void tanZero(double x) {
        assertEquals(0, Tangent.valueAt(x));
    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI / 4, Math.PI / 4 + Math.PI, Math.PI / 4 - Math.PI})
    void tanOne(double x) {
        assertEquals(1, Tangent.valueAt(x), NEAR_ZERO);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI / 4, -Math.PI / 4 + Math.PI, -Math.PI / 4 - Math.PI})
    void tanNegativeOne(double x) {
        assertEquals(-1, Tangent.valueAt(x), NEAR_ZERO);
    }

    @ParameterizedTest
    @ValueSource(doubles = {Math.PI / 2, Math.PI / 2 + Math.PI, Math.PI / 2 - Math.PI,
                            -Math.PI / 2, -Math.PI / 2 + Math.PI, -Math.PI / 2 - Math.PI,
                            Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY})
    void tanNaN(double x) {
        assertEquals(Double.NaN, Tangent.valueAt(x));
    }
}