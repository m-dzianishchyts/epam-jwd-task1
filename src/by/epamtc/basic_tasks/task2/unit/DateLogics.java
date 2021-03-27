package by.epamtc.basic_tasks.task2.unit;

public class DateLogics {

    public static int retrieveDaysAmountInMonth(int year, Month month) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be positive.");
        }
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return 31;
            case FEBRUARY:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 30;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be positive.");
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
