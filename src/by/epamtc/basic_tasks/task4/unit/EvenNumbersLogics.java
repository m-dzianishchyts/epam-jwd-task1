package by.epamtc.basic_tasks.task4.unit;

import java.util.stream.Stream;

public class EvenNumbersLogics {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean atLeastTwoAreEven(int numberA, int numberB, int numberC, int numberD) {
        return Stream.of(numberA, numberB, numberC, numberD).filter(EvenNumbersLogics::isEven).count() >= 2;
    }
}
