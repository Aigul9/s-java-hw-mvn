package TDD;

import java.util.Locale;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Word cannot be null.");
        }

        // empty проверяет длину
        // blank - читабельные символы
        if (word.isEmpty() || word.isBlank()) {
            return false;
        }

        word = word.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
        System.out.println(word);

        for (int i = 0; i < word.length() / 2; i++) {
            char a = word.charAt(i),
                    b = word.charAt(word.length() - i - 1);
            if (!Character.isAlphabetic(a) || !Character.isAlphabetic(b) || a != b) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        /*
        TDD
        1. Все входные и выходные данные
         */
        System.out.println(isPalindrome("12"));                         // false
        System.out.println(isPalindrome("11"));                         // false
//        System.out.println(isPalindrome(null));                         // throws runtime exception
        System.out.println(isPalindrome(""));                           // false
        System.out.println(isPalindrome("a"));                          // true
        System.out.println(isPalindrome("    "));                       // false
        System.out.println(isPalindrome("казак"));                      // true
        System.out.println(isPalindrome("А роза упала на лапу Азора")); // true
        System.out.println(isPalindrome("Bb"));                         // true
        System.out.println(isPalindrome("false"));                      // false
        System.out.println(isPalindrome("Java"));                       // false
    }
}