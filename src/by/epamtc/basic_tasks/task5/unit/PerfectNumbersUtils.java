package by.epamtc.basic_tasks.task5.unit;

public final class PerfectNumbersUtils {

    private PerfectNumbersUtils() {
    }

    /* A number is perfect if it is equal to the sum of all its proper divisors
     * (in other words all positive divisors other than the number itself).
     */
    public static boolean isPerfect(long number) {
        boolean isPerfect;
        if (number <= 0) {
            isPerfect = false;
        } else {
            long divisorsSum = calculateDivisorsSum(number);
            isPerfect = number == divisorsSum;
        }
        return isPerfect;
    }

    /* Calculates sum of divisors that are other than the number itself.
     * Uses absolute value of the number.
     */
    public static long calculateDivisorsSum(long number) {

        // Work with absolute value.
        long numberAbs = Math.abs(number);

        // 0 has an infinite number of divisors.
        if (numberAbs == 0) {
            return Long.MAX_VALUE;
        }

        // The only divisor of 1 is 1, but it does not fit.
        if (numberAbs == 1) {
            return 0;
        }

        // Each number is divisible by 1, so it can start with divisor sum of 1.
        // It will detect divisors faster by adding the divisor itself to the sum
        // and 'number / divisor' (which is also divisor).
        long divisorsSum = 1;
        for (long i = 2; i <= Math.sqrt(numberAbs); i++) {
            if (numberAbs % i == 0) {
                divisorsSum += i;
                if (i != Math.sqrt(numberAbs)) {
                    divisorsSum += numberAbs / i;
                }
            }
        }
        return divisorsSum;
    }
}
