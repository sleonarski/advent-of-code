package org.example.year2021.day1;

import static java.util.Collections.emptyList;
import static org.example.year2021.day1.PartOne.runPartOne;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class PartChunksOneTest {

    private static final Integer WINDOW_SIZE = 1;
    private static final List<Integer> INPUT_LIST = List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);
    private static final List<Integer> EMPTY_LIST = emptyList();
    private static final List<Integer> ONE_ELEMENT_LIST = List.of(199);
    private static final List<Integer> SAME_ELEMENT_LIST = List.of(199, 199, 199, 199, 199, 199, 199, 199, 199, 199, 199);

    @Test
    void shouldRunPartOne() {
        //when
        int solution = PartOne.runPartOne(INPUT_LIST, WINDOW_SIZE);
        assertEquals(7,solution);
    }

    @Test
    void shouldProcessEmptyList() {
        //when
        int solution = PartOne.runPartOne(EMPTY_LIST, WINDOW_SIZE);
        assertEquals(0,solution);
    }

    @Test
    void shouldProcessOneElementList() {
        //when
        int solution = PartOne.runPartOne(ONE_ELEMENT_LIST, WINDOW_SIZE);
        assertEquals(0,solution);
    }

    @Test
    void shouldProcessSameElementList() {
        //when
        int solution = PartOne.runPartOne(SAME_ELEMENT_LIST, WINDOW_SIZE);
        assertEquals(0,solution);
    }
}