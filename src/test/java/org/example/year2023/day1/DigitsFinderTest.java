package org.example.year2023.day1;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class DigitsFinderTest {

    private static final String TEST_STRING1 = "wwwtwoWWW";
    private static final String TEST_STRING2 = "wwwjedenWWW";

    @Test
    void shouldFindMatchAndRemoveDigitFromInput() {
        //given
        var finder = new DigitsFinder();
        //when
        String output = finder.findDigitsInLetters(TEST_STRING1);
        //expected
        assertEquals("wwwWWW", output);
        assertEquals(6, output.length());
    }

    @Test
    void test() {
        // Użyj wyrażenia regularnego do sprawdzenia, czy w ciągu znajduje się słowo reprezentujące liczbę
        Pattern pattern = Pattern.compile("(jeden|dwa|trzy|cztery|pięć|sześć|siedem|osiem|dziewięć)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(TEST_STRING2);

        assertTrue(matcher.find());

    }
}