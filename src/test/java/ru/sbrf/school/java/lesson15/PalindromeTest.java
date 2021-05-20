package ru.sbrf.school.java.lesson15;

import TDD.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    /*
    @Test
    void
    throws
     */
    @Test
    @DisplayName("Check empty word to be a palindrome.")
    public void testEmptyWord() throws Exception {
        boolean result = Palindrome.isPalindrome("");

        // expected - actual
//        Assertions.assertEquals(false, result);
        Assertions.assertFalse(result);
    }
}
