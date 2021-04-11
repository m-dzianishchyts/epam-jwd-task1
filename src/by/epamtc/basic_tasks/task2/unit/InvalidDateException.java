package by.epamtc.basic_tasks.task2.unit;

public class InvalidDateException extends Exception {

    public InvalidDateException() {
    }

    public InvalidDateException(String message) {
        super(message);
    }

    public InvalidDateException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDateException(Throwable cause) {
        super(cause);
    }
}
