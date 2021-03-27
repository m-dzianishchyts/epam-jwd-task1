package by.epamtc.basic_tasks.task6.unit;

public class DayTime {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public DayTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DayTime other = (DayTime) o;
        return hours == other.hours && minutes == other.minutes && seconds == other.seconds;
    }

    @Override
    public String toString() {
        return getClass() + "@(" + hours + ":" + minutes + ":" + seconds + ")";
    }

    @Override
    public int hashCode() {
        int result = hours ^ (hours >>> 16);
        result = 31 * result + (minutes ^ (minutes >>> 16));
        result = 31 * result + (seconds ^ (seconds >>> 16));
        return result;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
