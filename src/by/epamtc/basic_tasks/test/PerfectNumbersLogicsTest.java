package by.epamtc.basic_tasks.test;

import by.epamtc.basic_tasks.task5.unit.PerfectNumbersLogics;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersLogicsTest {

    @org.junit.jupiter.api.Test
    void isPerfect() {
        assertFalse(PerfectNumbersLogics.isPerfect(-345));
        assertFalse(PerfectNumbersLogics.isPerfect(-1));
        assertFalse(PerfectNumbersLogics.isPerfect(0));
        assertFalse(PerfectNumbersLogics.isPerfect(1));
        assertFalse(PerfectNumbersLogics.isPerfect(18));
        assertFalse(PerfectNumbersLogics.isPerfect(687));
        assertFalse(PerfectNumbersLogics.isPerfect(10_855));
        assertFalse(PerfectNumbersLogics.isPerfect(5_568_855));
        assertFalse(PerfectNumbersLogics.isPerfect(137_438_691_374L));
        assertFalse(PerfectNumbersLogics.isPerfect(2_305_843_042_139_952_128L));
        assertTrue(PerfectNumbersLogics.isPerfect(6));
        assertTrue(PerfectNumbersLogics.isPerfect(28));
        assertTrue(PerfectNumbersLogics.isPerfect(496));
        assertTrue(PerfectNumbersLogics.isPerfect(8_128));
        assertTrue(PerfectNumbersLogics.isPerfect(33_550_336));
        assertTrue(PerfectNumbersLogics.isPerfect(137_438_691_328L));
        assertTrue(PerfectNumbersLogics.isPerfect(2_305_843_008_139_952_128L));
    }

    @org.junit.jupiter.api.Test
    void calculateDivisorsSum() {
        assertEquals(16, PerfectNumbersLogics.calculateDivisorsSum(-12));
        assertEquals(0, PerfectNumbersLogics.calculateDivisorsSum(-1));
        assertEquals(Long.MAX_VALUE, PerfectNumbersLogics.calculateDivisorsSum(0));
        assertEquals(0, PerfectNumbersLogics.calculateDivisorsSum(1));
        assertEquals(1, PerfectNumbersLogics.calculateDivisorsSum(2));
        assertEquals(3, PerfectNumbersLogics.calculateDivisorsSum(4));
        assertEquals(6, PerfectNumbersLogics.calculateDivisorsSum(6));
        assertEquals(16, PerfectNumbersLogics.calculateDivisorsSum(12));
        assertEquals(42, PerfectNumbersLogics.calculateDivisorsSum(30));
    }
}