package org.example.day3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ReportDecoderTest {

    private static final String TEST_DATA = """
            00100
            11110
            10110
            10111
            10101
            01111
            00111
            11100
            10000
            11001
            00010
            01010
            """;

    @Test
    void shouldCalculateRateValues() {
        //given
        var calculator = new RateCalculator();
        //when
        RateVault rate = calculator.calculate(List.of(TEST_DATA.split("\n")));
        //then
        assertEquals(rate.gamma(), 22);
        assertEquals(rate.epsilon(), 9);
    }
}