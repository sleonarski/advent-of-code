package org.example.year2021.day2;

import org.junit.jupiter.api.Test;

import static org.example.year2021.day2.PartTwo.solvePartTwo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class PartTwoTest {

    @Test
    void shouldRunPartTwo() {
        //when
        int solution = PartTwo.solvePartTwo(MockData.TEST_DATA);

        //then
        assertEquals(900, solution);
    }

    @Test
    void shouldRunPartTwoWithPathInput() {
        //when
        int solution = PartTwo.solvePartTwo(MockData.TEST_PATH);

        //then
        assertEquals(900, solution);
    }

    @Test
    void shouldRunPartOneOnEmptyList() {
        //when
        int solution = PartTwo.solvePartTwo(MockData.EMPTY);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnOneValueList() {
        //when
        int solution = PartTwo.solvePartTwo(MockData.ONE_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnSameValueList() {
        //when
        int solution = PartTwo.solvePartTwo(MockData.SAME_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnInvalidValueList() {
        //expected
        assertThrowsExactly(IllegalArgumentException.class, () -> PartTwo.solvePartTwo(MockData.INVALID_VALUE_LIST));
    }
}