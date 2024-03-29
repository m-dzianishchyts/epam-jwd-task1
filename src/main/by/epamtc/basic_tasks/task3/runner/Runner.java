package by.epamtc.basic_tasks.task3.runner;

import by.epamtc.basic_tasks.scanner.DataScanningUtils;
import by.epamtc.basic_tasks.task3.unit.InnerOuterSquaresUtils;
import by.epamtc.basic_tasks.task3.unit.InvalidShapePropertyException;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter area of outer square: ");
        double outerSquareArea = DataScanningUtils.enterPositiveDoubleFromConsole();

        try {
            double innerSquareArea = InnerOuterSquaresUtils.calculateInnerSquareAreaByOuterSquareArea(outerSquareArea);
            double difference = outerSquareArea / innerSquareArea;
            System.out.println("Area of inscribed square: " + innerSquareArea);
            System.out.printf("Area of given square is %f times greater than area of inscribed square.\n", difference);
        } catch (InvalidShapePropertyException e) {
            e.printStackTrace();
        }
    }
}
