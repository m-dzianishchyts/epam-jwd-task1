package by.epamtc.basic_tasks.task6.unit;

import java.time.Duration;

public class TimeLogics {

    private static final int SECONDS_PER_DAY = 86400;

    public static DayTime calculateDayTimeByCurrentSecond(int secondNumber) {
        if (secondNumber <= 0) {
            throw new IllegalArgumentException("Current second number must be positive.");
        }
        if (secondNumber > SECONDS_PER_DAY) {
            throw new IllegalArgumentException("Current second number cannot be greater then " + SECONDS_PER_DAY + ".");
        }
        Duration duration = Duration.ofSeconds(secondNumber - 1);
        DayTime dayTime = new DayTime(duration.toHoursPart(), duration.toMinutesPart(), duration.toSecondsPart());
        return dayTime;
    }
}
