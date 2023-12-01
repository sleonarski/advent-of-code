package org.example.year2021.day2;

import static org.example.year2021.day2.PartOne.solvePartOne;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartOneTest {

    @Test
    void shouldRunPartOne() {
        //when
        int solution = PartOne.solvePartOne(MockData.TEST_DATA);

        //then
        assertEquals(150, solution);
    }

    @Test
    void shouldRunPartOneWithPathInput() {
        //when
        int solution = PartOne.solvePartOne(MockData.TEST_PATH);

        //then
        assertEquals(150, solution);
    }

    @Test
    void shouldRunPartOneOnEmptyList() {
        //when
        int solution = PartOne.solvePartOne(MockData.EMPTY);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnOneValueList() {
        //when
        int solution = PartOne.solvePartOne(MockData.ONE_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnSameValueList() {
        //when
        int solution = PartOne.solvePartOne(MockData.SAME_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnInvalidValueList() {
        //expected
        assertThrowsExactly(IllegalArgumentException.class, () -> PartOne.solvePartOne(MockData.INVALID_VALUE_LIST));
    }
}