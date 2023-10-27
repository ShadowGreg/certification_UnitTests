package ru.gb;

import java.util.List;

import static ru.gb.AvgCalc.calculateAverage;

/**
 * This class provides a method to compare the average values of two lists of integers.
 */
public class Comparison {

    /**
     * Compares the average values of two lists of integers.
     *
     * @param list1 the first list of integers
     * @param list2 the second list of integers
     * @return a string indicating which list has a greater average value, or if the average values are equal
     */
    public static String compare(List<Integer> list1, List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}