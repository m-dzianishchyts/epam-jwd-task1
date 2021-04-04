package by.epamtc.basic_tasks.task6.unit;

public class DayTime {

    private int hours;
    private int minutes;
    private int seconds;

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
        boolean equals = hours == other.hours && minutes == other.minutes && seconds == other.seconds;
        return equals;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@(" + hours + ":" + minutes + ":" + seconds + ")";
    }

    @Override
    public int hashCode() {
        int hashCode = hours ^ (hours >>> 16);
        hashCode = 31 * hashCode + (minutes ^ (minutes >>> 16));
        hashCode = 31 * hashCode + (seconds ^ (seconds >>> 16));
        return hashCode;
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

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
