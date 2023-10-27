package ru.gb;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMainWhenListsComparedThenPrintResult() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String[] args = {"1", "2", "3", "4", "5", "6"};

        // Act
        Main.main(args);

        // Assert
        String expectedOutput = "Второй список имеет большее среднее значение" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
