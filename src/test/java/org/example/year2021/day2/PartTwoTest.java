package org.example.year2021.day2;

import org.junit.jupiter.api.Test;

import static org.example.day2.MockData.*;
import static org.example.day2.MockData.INVALID_VALUE_LIST;
import static org.example.year2021.day2.PartTwo.solvePartTwo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class PartTwoTest {

    @Test
    void shouldRunPartTwo() {
        //when
        int solution = solvePartTwo(TEST_DATA);

        //then
        assertEquals(900, solution);
    }

    @Test
    void shouldRunPartTwoWithPathInput() {
        //when
        int solution = solvePartTwo(TEST_PATH);

        //then
        assertEquals(900, solution);
    }

    @Test
    void shouldRunPartOneOnEmptyList() {
        //when
        int solution = solvePartTwo(EMPTY);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnOneValueList() {
        //when
        int solution = solvePartTwo(ONE_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnSameValueList() {
        //when
        int solution = solvePartTwo(SAME_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnInvalidValueList() {
        //expected
        assertThrowsExactly(IllegalArgumentException.class, () -> solvePartTwo(INVALID_VALUE_LIST));
    }
}