package by.epamtc.basic_tasks.task5;

import by.epamtc.basic_tasks.task5.unit.PerfectNumbersUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerfectNumbersLogicsTest {

    @ParameterizedTest
    @ValueSource(longs = {6, 28, 496, 8_128, 33_550_336, 137_438_691_328L, 2_305_843_008_139_952_128L})
    void isPerfectTrue(long number) {
        assertTrue(PerfectNumbersUtils.isPerfect(number));
    }

    @ParameterizedTest
    @ValueSource(longs = {-345, -1, 0, 1, 18, 687, 10_885, 5_568_855, 137_438_691_374L, 2_305_843_042_139_952_128L})
    void isPerfectFalse(long number) {
        assertFalse(PerfectNumbersUtils.isPerfect(number));
    }

    @ParameterizedTest
    @CsvSource({"16, -12", "0, -1", "9223372036854775807, 0", "0, 1", "1, 2", "3, 4", "6, 6", "16, 12", "42, 30"})
    void calculateDivisorsSum(long expectedSum, long number) {
        assertEquals(expectedSum, PerfectNumbersUtils.calculateDivisorsSum(number));
    }
}