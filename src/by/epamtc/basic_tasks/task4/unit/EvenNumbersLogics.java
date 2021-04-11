package by.epamtc.basic_tasks.task4.unit;

public class EvenNumbersLogics {

    public static boolean areEvenAtLeastTwo(int... numbers) throws InvalidNumbersException {
        if (numbers == null) {
            throw new InvalidNumbersException("Number array cannot be null.");
        }
        int evensCounter = 0;
        boolean atLeastTwoAreEven = false;
        for (var number : numbers) {
            if (number % 2 == 0) {
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
