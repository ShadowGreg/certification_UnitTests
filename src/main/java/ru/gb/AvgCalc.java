package ru.gb;

import java.util.List;

/**
 * This class provides a method to calculate the average of a list of integers.
 */
public class AvgCalc {

    /**
     * Calculates the average of a list of integers.
     *
     * @param list the list of integers
     * @return the average of the list, or 0.0 if the list is null or empty
     */
    public static double calculateAverage(List<Integer> list) {
        int sum = 0;
        if (list == null || list.isEmpty()) {
            return 0.0;
        }
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }
}