package by.epamtc.basic_tasks.task6.unit;

public class TimeLogics {

    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;

    public static DayTime calculateDayTimeByCurrentSecond(int secondNumber) throws InvalidTimeException {
        if (secondNumber <= 0) {
            throw new InvalidTimeException("Current second number must be positive.");
        }
        int secondsPerDay = SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY;
        if (secondNumber > secondsPerDay) {
            throw new InvalidTimeException("Current second number cannot be greater then " + secondsPerDay + ".");
        }
        int passedSecondsAmount = secondNumber - 1;
        int secondsPerHour = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
        int passedTimeHours = passedSecondsAmount / secondsPerHour;
        int passedTimeMinutes = (passedSecondsAmount % secondsPerHour) / SECONDS_PER_MINUTE;
        int passedTimeSeconds = passedSecondsAmount % SECONDS_PER_MINUTE;
        DayTime dayTime = new DayTime(passedTimeHours, passedTimeMinutes, passedTimeSeconds);
        return dayTime;
    }
}
