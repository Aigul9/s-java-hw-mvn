package ru.sbrf.school.java.lesson15;

import TDD.Line;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    @DisplayName("Check regular line.")
    public void testRegularLine() throws Exception {
        String line = "1000111110001";
        Assertions.assertEquals(5, Line.getLength(line));
    }

    @Test
    @DisplayName("Check line with all 1s.")
    public void testAllOnes() throws Exception {
        String line = "1111";
        Assertions.assertEquals(4, Line.getLength(line));
    }

    @Test
    @DisplayName("Check line without any 1s.")
    public void testAllZeros() throws Exception {
        String line = "0000";
        Assertions.assertEquals(0, Line.getLength(line));
    }
}
