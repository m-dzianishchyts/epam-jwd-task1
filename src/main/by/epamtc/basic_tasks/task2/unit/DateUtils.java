package by.epamtc.basic_tasks.task2.unit;

public final class DateUtils {

    private DateUtils() {
    }

    public static int retrieveDaysAmountInMonth(int year, Month month) throws InvalidDateException {
        checkYear(year);
        checkMonth(month);
        int daysAmountInMonth;
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                daysAmountInMonth =  31;
                break;
            case FEBRUARY:
                daysAmountInMonth = isLeapYear(year) ? 29 : 28;
                break;
            default:
                daysAmountInMonth = 30;
        }
        return daysAmountInMonth;
    }

    public static boolean isLeapYear(int year) throws InvalidDateException {
        checkYear(year);
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return isLeapYear;
    }

    private static void checkMonth(Month month) throws InvalidDateException {
        if (month == null) {
            throw new InvalidDateException("Month cannot be null.");
        }
    }

    private static void checkYear(int year) throws InvalidDateException {
        if (year <= 0) {
            throw new InvalidDateException("Year must be positive.");
        }
    }
}
