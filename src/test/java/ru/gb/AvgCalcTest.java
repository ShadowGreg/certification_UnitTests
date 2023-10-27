package ru.gb;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AvgCalcTest {

    @Test
    public void testCalculateAverageWithEmptyList() {
        List<Integer> list = Collections.emptyList();
        double result = AvgCalc.calculateAverage(list);
        assertEquals(0.0, result, "Среднее значение пустого списка должно быть 0.0");
    }

    @Test
    public void testCalculateAverageWithOneElement() {
        List<Integer> list = Collections.singletonList(5);
        double result = AvgCalc.calculateAverage(list);
        assertEquals(5.0, result, "Среднее значение списка с одним элементом должно быть равно этому элементу");
    }

    @Test
    public void testCalculateAverageWithMultipleElements() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double result = AvgCalc.calculateAverage(list);
        assertEquals(3.0, result, "Среднее значение списка 1, 2, 3, 4, 5 должно быть равно 3.0");
    }

    @Test
    public void testCalculateAverageWithNegativeNumbers() {
        List<Integer> list = Arrays.asList(-1, -2, -3, -4, -5);
        double result = AvgCalc.calculateAverage(list);
        assertEquals(-3.0, result, "Среднее значение списка -1, -2, -3, -4, -5 должно быть равно -3.0");
    }
}
