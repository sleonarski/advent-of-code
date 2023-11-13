package org.example.year2021.day2;

import static org.example.day2.MockData.EMPTY;
import static org.example.day2.MockData.INVALID_VALUE_LIST;
import static org.example.day2.MockData.ONE_VALUE_LIST;
import static org.example.day2.MockData.SAME_VALUE_LIST;
import static org.example.day2.MockData.TEST_DATA;
import static org.example.day2.MockData.TEST_PATH;
import static org.example.year2021.day2.PartOne.solvePartOne;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartOneTest {

    @Test
    void shouldRunPartOne() {
        //when
        int solution = solvePartOne(TEST_DATA);

        //then
        assertEquals(150, solution);
    }

    @Test
    void shouldRunPartOneWithPathInput() {
        //when
        int solution = solvePartOne(TEST_PATH);

        //then
        assertEquals(150, solution);
    }

    @Test
    void shouldRunPartOneOnEmptyList() {
        //when
        int solution = solvePartOne(EMPTY);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnOneValueList() {
        //when
        int solution = solvePartOne(ONE_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnSameValueList() {
        //when
        int solution = solvePartOne(SAME_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnInvalidValueList() {
        //expected
        assertThrowsExactly(IllegalArgumentException.class, () -> solvePartOne(INVALID_VALUE_LIST));
    }
}