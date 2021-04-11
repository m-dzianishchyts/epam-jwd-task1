package by.epamtc.basic_tasks.task3.unit;

public class InvalidShapePropertyException extends Exception {

    public InvalidShapePropertyException() {
    }

    public InvalidShapePropertyException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidShapePropertyException(Throwable cause) {
        super(cause);
    }

    public InvalidShapePropertyException(String message) {
        super(message);
    }
}
