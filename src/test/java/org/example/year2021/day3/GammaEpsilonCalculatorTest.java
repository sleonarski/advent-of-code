package org.example.year2021.day3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class GammaEpsilonCalculatorTest {

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
        var calculator = new GammaEpsilonCalculator();
        //when
        int calculatedRate = calculator.calculate(List.of(TEST_DATA.split("\n")));
        System.out.println(calculatedRate);
        //then
        assertEquals(198, calculatedRate);
    }

    @Test
    void shouldThrowExceptionWhenCalculateRateValuesWithEmptyListAsAParameter() {
        //given
        var calculator = new GammaEpsilonCalculator();
        //when
        Throwable throwable = assertThrows(Throwable.class, () -> {
            calculator.calculate(List.of());
        });
        //then
        assertEquals(IllegalArgumentException.class, throwable.getClass());
    }

    @Test
    void shouldThrowExceptionWhenCalculateRateValuesWithNull() {
        //given
        var calculator = new GammaEpsilonCalculator();
        //when
        Throwable throwable = assertThrows(Throwable.class, () -> {
            calculator.calculate(null);
        });
        //then
        assertEquals(IllegalArgumentException.class, throwable.getClass());
    }
}