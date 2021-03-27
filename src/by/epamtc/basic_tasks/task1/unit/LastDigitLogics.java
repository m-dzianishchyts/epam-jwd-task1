package by.epamtc.basic_tasks.task1.unit;

public class LastDigitLogics {

    public static int calculateLastDigitOfSquareOf(int number) {
        int lastDigitOfNumber = number % 10;
        return (lastDigitOfNumber * lastDigitOfNumber) % 10;
    }
}
