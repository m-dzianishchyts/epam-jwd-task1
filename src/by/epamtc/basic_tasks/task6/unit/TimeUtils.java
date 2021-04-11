package by.epamtc.basic_tasks.task6.unit;

public final class TimeUtils {

    private TimeUtils() {
    }

    public static DayTime calculateDayTimeByCurrentSecond(int secondNumber) throws InvalidTimeException {
        if (secondNumber <= 0) {
            throw new InvalidTimeException("Current second number must be positive.");
        }
        int secondsPerDay = DayTime.SECONDS_PER_MINUTE * DayTime.MINUTES_PER_HOUR * DayTime.HOURS_PER_DAY;

        // Remember one possible leap second.
        if (secondNumber > secondsPerDay + 1) {
            throw new InvalidTimeException("Current second number cannot be greater then " + (secondsPerDay + 1) + ".");
        }
        int passedSecondsAmount = secondNumber - 1;

        // Remove leap second, if any, to calculate day time correctly.
        int leapSecond = passedSecondsAmount / secondsPerDay;
        passedSecondsAmount -= leapSecond;

        int secondsPerHour = DayTime.SECONDS_PER_MINUTE * DayTime.MINUTES_PER_HOUR;
        int passedTimeHours = passedSecondsAmount / secondsPerHour;
        int passedTimeMinutes = (passedSecondsAmount % secondsPerHour) / DayTime.SECONDS_PER_MINUTE;

        // Consider leap second now.
        int passedTimeSeconds = passedSecondsAmount % DayTime.SECONDS_PER_MINUTE + leapSecond;
        DayTime dayTime = new DayTime(passedTimeHours, passedTimeMinutes, passedTimeSeconds);
        return dayTime;
    }
}
