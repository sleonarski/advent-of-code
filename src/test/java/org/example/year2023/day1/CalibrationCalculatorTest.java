package org.example.year2023.day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalibrationCalculatorTest {

    private final String TEST_DATA1 = """
            1abc2
            pqr3stu8vwx
            a1b2c3d4e5f
            treb7uchet""";

    private final String TEST_DATA2 = """
            two1nine
            eightwothree
            abcone2threexyz
            xtwone3four
            4nineeightseven2
            zoneight234
            7pqrstsixteen""";


    @Test
    void shouldCalculateCalibration() {
        //given
        var calculator = new CalibrationCalculator();
        List<String> input = Arrays.asList(TEST_DATA1.split("\n"));
        //when
        int output = calculator.calculateCalibrateValue(input, false);
        //then
        assertEquals(142, output);
    }

    @Test
    void shouldCalculateCalibrationWithDigitsInLetters() {
        //given
        var calculator = new CalibrationCalculator();
        List<String> input = Arrays.asList(TEST_DATA2.split("\n"));
        //when
        int output = calculator.calculateCalibrateValue(input, true);
        //then
        assertEquals(281, output);
    }
}