package by.epamtc.basic_tasks.task10.printer;

import java.util.Map;

public class FunctionValuesPrinter {

    private static final int TABLE_WIDTH = 30;
    private static final int RESERVED_TABLE_WIDTH = 7;
    private static final int X_COLUMN_WIDTH = (int) Math.round((TABLE_WIDTH - RESERVED_TABLE_WIDTH)/ 2.0);
    private static final int Y_COLUMN_WIDTH = TABLE_WIDTH - RESERVED_TABLE_WIDTH - X_COLUMN_WIDTH;

    public static void printValuesOf(Map<Double, Double> functionValues) {
        System.out.println("=".repeat(TABLE_WIDTH));
        System.out.printf("| %" + X_COLUMN_WIDTH + "s | %" + Y_COLUMN_WIDTH + "s |\n", "X", "Y");
        System.out.println("=".repeat(TABLE_WIDTH));

        functionValues.forEach((x, y) ->
                System.out.printf("| %" + X_COLUMN_WIDTH + "f | %" + Y_COLUMN_WIDTH + "f |\n", x, y));
        System.out.println("=".repeat(TABLE_WIDTH));
    }
}
