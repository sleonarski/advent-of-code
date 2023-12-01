package org.example.year2023.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalibrationCalculatorTest {

    private final String TEST_DATA = """
            1abc2
            pqr3stu8vwx
            a1b2c3d4e5f
            treb7uchet""";

    @Test
    void shouldCalculateCalibration() {
        //given
        var calculator = new CalibrationCalculator();
        //when
        int output = calculator.calculate(TEST_DATA);
        //then
        assertEquals(142, output);
    }
}