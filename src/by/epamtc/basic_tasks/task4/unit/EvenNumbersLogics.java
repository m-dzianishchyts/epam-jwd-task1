package by.epamtc.basic_tasks.task4.unit;

import java.util.stream.Stream;

public class EvenNumbersLogics {

    public static boolean isEven(int number) {
        boolean isEven = number % 2 == 0;
        return isEven;
    }

    public static boolean areEvenAtLeastTwo(int numberA, int numberB, int numberC, int numberD) {
        long evensAmount = Stream.of(numberA, numberB, numberC, numberD).filter(EvenNumbersLogics::isEven).count();
        boolean atLeastTwoAreEven = evensAmount >= 2;
        return atLeastTwoAreEven;
    }
}
