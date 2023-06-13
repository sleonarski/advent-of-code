package org.example;

import static java.util.Collections.emptyList;
import static org.example.DayOnePartTwo.runPartTwo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class DayOnePartTwoTest {

    private static final Integer WINDOW_SIZE = 3;
    private static final String PATH = "day-1/src/test/resources/input.txt";
    private static final List<Integer> EMPTY_LIST = emptyList();
    private static final List<Integer> ONE_ELEMENT_LIST = List.of(199);
    private static final List<Integer> SAME_ELEMENT_LIST = List.of(199, 199, 199, 199, 199, 199, 199, 199, 199, 199, 199);

    @Test
    void shouldRunPartTwo() {
        //when
        int solution = runPartTwo(PATH, WINDOW_SIZE);
        assertEquals(5, solution);
    }

    @Test
    void shouldProcessEmptyList() {
        //when
        int solution = runPartTwo(EMPTY_LIST, WINDOW_SIZE);
        assertEquals(0, solution);
    }

    @Test
    void shouldProcessOneElementList() {
        //when
        int solution = runPartTwo(ONE_ELEMENT_LIST, WINDOW_SIZE);
        assertEquals(0, solution);
    }

    @Test
    void shouldProcessSameElementList() {
        //when
        int solution = runPartTwo(SAME_ELEMENT_LIST, WINDOW_SIZE);
        assertEquals(0, solution);
    }
}