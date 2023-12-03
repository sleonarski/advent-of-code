package org.example.year2023.day1;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class DigitsFinderTest {

    private static final String TEST_STRING = "wwwtwoWWW";
    private static final String TEST_STRING_FEW_DIGITS = "wwwtwoWWWoness";
    private static final String TEST_STRING_FEW_DIGITS_REVERSED = "kthreeightk";

    @Test
    void shouldFindMatchAndRemoveDigitFromInput() {
        //given
        var finder = new DigitsFinder();
        //when
        String output = finder.findDigitsInLetters(TEST_STRING);
        //expected
        assertEquals("wwwWWW", output);
        assertEquals(6, output.length());
    }

    @Test
    void shouldMatchFewDigits() {
        var finder = new DigitsFinder();
        String digitsInLetters = finder.findDigitsInLetters(TEST_STRING_FEW_DIGITS);
        assertEquals("wwwWWWss", digitsInLetters);
        assertEquals(8, digitsInLetters.length());
    }

    @Test
    void shouldMatchFewDigitsInReverse() {
        var finder = new DigitsFinder();
        String digitsInLetters = finder.findDigitsInLetters(TEST_STRING_FEW_DIGITS_REVERSED);
        assertEquals("kthrek", digitsInLetters);
        assertEquals(6, digitsInLetters.length());
    }
}