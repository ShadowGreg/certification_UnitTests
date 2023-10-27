package ru.gb;

import java.util.ArrayList;
import java.util.List;

import static ru.gb.Comparison.compare;

/**
 * This class contains the main method to compare the average values of two lists of integers.
 */
public class Main {
    /**
     * Compares the average values of two lists of integers and prints the result.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println(compare(list1, list2));
    }
}