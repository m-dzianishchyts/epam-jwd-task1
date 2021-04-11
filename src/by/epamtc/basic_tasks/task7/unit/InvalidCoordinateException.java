package by.epamtc.basic_tasks.task7.unit;

public class InvalidCoordinateException extends Exception {

    public InvalidCoordinateException() {
    }

    public InvalidCoordinateException(String message) {
        super(message);
    }

    public InvalidCoordinateException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCoordinateException(Throwable cause) {
        super(cause);
    }
}
