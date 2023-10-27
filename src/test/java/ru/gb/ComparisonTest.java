package ru.gb;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonTest {

    @Test
    public void testCompareWithFirstListHavingHigherAverage() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2);

        String result = Comparison.compare(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareWithSecondListHavingHigherAverage() {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        String result = Comparison.compare(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareWithEqualAverages() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        String result = Comparison.compare(list1, list2);

        assertEquals("Средние значения равны", result);
    }
}