package org.example.year2021.day1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class AggregatedWindowTest {

    private static final List<Integer> TEST_DATA = List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);
    private static final int WINDOW_SIZE = 3;

    @Test
    void shouldAddNextNumber() {
        //given
        AggregatedWindow aggregatedWindow = new AggregatedWindow(WINDOW_SIZE);
        for (Integer testDatum : TEST_DATA) {
            aggregatedWindow.nextNumber(testDatum);
        }

        //when
        int  count = aggregatedWindow.getCount();

        //then
        assertEquals(5, count);
    }
}