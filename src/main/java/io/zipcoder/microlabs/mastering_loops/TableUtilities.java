package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) { //Index position of 4
                int result = i * j;
                table.append(String.format("%3d |", result));
            }
            table.append("\n");
        }
        return table.toString();

    }

    public static String getLargeMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) { //Index position of 9
                int result = i * j;
                table.append(String.format("%3d |", result));
            }
            table.append("\n");
        }
        return table.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) { //Index position of 3
                int result = i * j;
                table.append(String.format("%3d |", result));
            }
            table.append("\n");
        }
        return table.toString();
    }
}
