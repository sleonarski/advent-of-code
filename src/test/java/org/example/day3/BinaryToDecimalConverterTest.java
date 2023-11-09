package org.example.day3;

import static java.lang.Integer.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BinaryToDecimalConverterTest {

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "101, 5", "1011, 11"})
    void shouldConvertBinaryInputToDecimal(String given, String expected) {
        //given
        var converter = new BinaryToDecimalConverter();

        //when
        int converted = converter.convert(given);

        //expected
        assertEquals(parseInt(expected), converted);
    }
}