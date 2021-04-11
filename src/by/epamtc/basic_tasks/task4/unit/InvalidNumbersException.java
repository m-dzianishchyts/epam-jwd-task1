package by.epamtc.basic_tasks.task4.unit;

public class InvalidNumbersException extends Exception {

    public InvalidNumbersException() {
    }

    public InvalidNumbersException(String message) {
        super(message);
    }

    public InvalidNumbersException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNumbersException(Throwable cause) {
        super(cause);
    }
}
