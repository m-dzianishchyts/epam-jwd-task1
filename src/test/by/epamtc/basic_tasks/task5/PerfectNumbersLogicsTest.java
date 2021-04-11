package by.epamtc.basic_tasks.task5;

import by.epamtc.basic_tasks.task5.unit.PerfectNumbersUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerfectNumbersLogicsTest {

    @org.junit.jupiter.api.Test
    void isPerfect() {
        assertFalse(PerfectNumbersUtils.isPerfect(-345));
        assertFalse(PerfectNumbersUtils.isPerfect(-1));
        assertFalse(PerfectNumbersUtils.isPerfect(0));
        assertFalse(PerfectNumbersUtils.isPerfect(1));
        assertFalse(PerfectNumbersUtils.isPerfect(18));
        assertFalse(PerfectNumbersUtils.isPerfect(687));
        assertFalse(PerfectNumbersUtils.isPerfect(10_855));
        assertFalse(PerfectNumbersUtils.isPerfect(5_568_855));
        assertFalse(PerfectNumbersUtils.isPerfect(137_438_691_374L));
        assertFalse(PerfectNumbersUtils.isPerfect(2_305_843_042_139_952_128L));
        assertTrue(PerfectNumbersUtils.isPerfect(6));
        assertTrue(PerfectNumbersUtils.isPerfect(28));
        assertTrue(PerfectNumbersUtils.isPerfect(496));
        assertTrue(PerfectNumbersUtils.isPerfect(8_128));
        assertTrue(PerfectNumbersUtils.isPerfect(33_550_336));
        assertTrue(PerfectNumbersUtils.isPerfect(137_438_691_328L));
        assertTrue(PerfectNumbersUtils.isPerfect(2_305_843_008_139_952_128L));
    }

    @org.junit.jupiter.api.Test
    void calculateDivisorsSum() {
        assertEquals(16, PerfectNumbersUtils.calculateDivisorsSum(-12));
        assertEquals(0, PerfectNumbersUtils.calculateDivisorsSum(-1));
        assertEquals(Long.MAX_VALUE, PerfectNumbersUtils.calculateDivisorsSum(0));
        assertEquals(0, PerfectNumbersUtils.calculateDivisorsSum(1));
        assertEquals(1, PerfectNumbersUtils.calculateDivisorsSum(2));
        assertEquals(3, PerfectNumbersUtils.calculateDivisorsSum(4));
        assertEquals(6, PerfectNumbersUtils.calculateDivisorsSum(6));
        assertEquals(16, PerfectNumbersUtils.calculateDivisorsSum(12));
        assertEquals(42, PerfectNumbersUtils.calculateDivisorsSum(30));
    }
}