package org.example.year2023.day1;

import org.junit.jupiter.api.Test;

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
        String output = finder.findRightMostDigit(TEST_STRING);
        //expected
        assertEquals("www2WWW", output);
        assertEquals(7, output.length());
    }

    @Test
    void shouldMatchOnlyOneDigit() {
        var finder = new DigitsFinder();
        String digit = TEST_STRING_FEW_DIGITS;
        digit = finder.findRightMostDigit(digit);
        digit = finder.findLeftMostDigit(digit);
        assertEquals("www2WWW1ss", digit);
        assertEquals(10, digit.length());
    }

    @Test
    void shouldMatchFewDigitsInReverse() {
        var finder = new DigitsFinder();
        String rightDigitsInLetters = finder.findRightMostDigit(TEST_STRING_FEW_DIGITS_REVERSED);
        String leftDigitsInLetters = finder.findLeftMostDigit(TEST_STRING_FEW_DIGITS_REVERSED);
        assertEquals("kthre8k", rightDigitsInLetters);
        assertEquals("k3ightk", leftDigitsInLetters);
        assertEquals(7, rightDigitsInLetters.length());
    }
}