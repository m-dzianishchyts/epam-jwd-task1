package by.epamtc.basic_tasks.task10.unit;

public class InvalidIntervalException extends Exception {

    public InvalidIntervalException() {
        super();
    }

    public InvalidIntervalException(String message) {
        super(message);
    }

    public InvalidIntervalException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIntervalException(Throwable cause) {
        super(cause);
    }
}
