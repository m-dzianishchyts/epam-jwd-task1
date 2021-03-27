package by.epamtc.basic_tasks.task2.unit;

public class DateLogics {

    public static int retrieveDaysAmountInMonth(int year, Month month) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be positive.");
        }
        if (month == null) {
            throw new IllegalArgumentException("Month cannot be null.");
        }
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

    public static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be positive.");
        }
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return isLeapYear;
    }
}
