package org.example.year2021.day3;

import static java.util.Collections.*;
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
    void shouldDecodeGivenInput() {
        //given
        ReportDecoder decoder = new ReportDecoder(singletonList(TEST_DATA));

        //when
        List<List<String>> decoded = decoder.decode();
        //then
        assertEquals(TEST_DATA.split("").length, decoded.size());
    }
}