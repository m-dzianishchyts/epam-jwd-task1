package by.epamtc.basic_tasks.task9.unit;

public class InvalidCirclePropertyException extends Exception {

    public InvalidCirclePropertyException() {
    }

    public InvalidCirclePropertyException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCirclePropertyException(Throwable cause) {
        super(cause);
    }

    public InvalidCirclePropertyException(String message) {
        super(message);
    }
}
