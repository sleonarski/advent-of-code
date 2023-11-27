package org.example.year2021.day3;

import org.junit.jupiter.api.Test;

import java.util.List;


class LifeSupportCalculatorTest {

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
/*
    0 1 1 1 1 0 0 1 1 1 0 0 -> 1-7 0-5

    1 0 0 0 1 0 1 -> 1-3 0-4

    1 1 1 0 -> 1-3 0-1

    1 1 0 -> 1-2 0-1

    0 1 -> 1-1 0-1 -> 1

    10111 - 23

 */

    @Test
    void shouldCalculateLifeSupportRate() {
        //given
        var calc = new LifeSupportCalculator();
        //when
        int calculatedLS = calc.calculate(List.of(TEST_DATA.split("\n")));
        //then

    }
}