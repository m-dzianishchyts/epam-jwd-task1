package by.epamtc.basic_tasks.task7.unit;

public class InvalidCircleException extends Exception {

    public InvalidCircleException() {
    }

    public InvalidCircleException(String message) {
        super(message);
    }

    public InvalidCircleException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCircleException(Throwable cause) {
        super(cause);
    }
}
