package org.example.year2023.day1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DigitsFinderTest {

    private static final String TEST_STRING = "twofiveoneseven1rqjvrrxtwonen";
    private static final String TEST_STRING2 = "eightfive37688eighteightwof";
    private static final String TEST_STRING_FEW_DIGITS = "wwwtwoWWWoness";
    private static final String TEST_STRING_FEW_DIGITS_REVERSED = "kthreeightk";

    @ParameterizedTest
    @CsvSource({"eightfive37688eighteightwof, e8tfive37688e8te8t2of",
            "twofiveoneseven1rqjvrrxtwonen, t2ofiveo1eseven1rqjvrrxt2o1en",
            "wwwtwoWWWoness, wwwt2oWWWo1ess",
            "kthreeightk, kt3e8tk"})
    void shouldFindMatchAndRemoveDigitFromInput(String input, String expected) {
        //given
        var finder = new DigitsFinder();
        //when
        String test = input;
        test = finder.findLeftMostDigit(test);
        test = finder.findRightMostDigit(test);
        //expected
        assertEquals(expected, test);
    }
}