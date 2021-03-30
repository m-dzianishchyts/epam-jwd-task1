package by.epamtc.basic_tasks.task4.unit;

public class EvenNumbersLogics {

    public static boolean isEven(int number) {
        boolean isEven = number % 2 == 0;
        return isEven;
    }

    public static boolean areEvenAtLeastTwo(int numberA, int numberB, int numberC, int numberD) {
        int evensCounter = 0;
        boolean atLeastTwoAreEven = false;
        for (var number : new int[] {numberA, numberB, numberC, numberD}) {
            if (isEven(number)) {
                evensCounter++;
                if (evensCounter >= 2) {
                    atLeastTwoAreEven = true;
                    break;
                }
            }
        }
        return atLeastTwoAreEven;
    }
}
