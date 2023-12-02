package org.example.year2023.day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalibrationCalculator {

    public int calculateCalibrateValue(List<String> input, boolean digitsInLetters) {

        return input.stream()
                .map((String line) -> getNumbers(line, digitsInLetters))
                .mapToInt(this::getCalibrationValue)
                        .sum();
    }

    private int getCalibrationValue(String numbers) {
        var calibrationPair = new StringBuilder();
        char firstNumber = numbers.charAt(0);
        calibrationPair.append(firstNumber);
        if (numbers.length() == 1) {
            calibrationPair.append(firstNumber);
        } else {
            char lastNumber = numbers.charAt(numbers.length() - 1);
            calibrationPair.append(lastNumber);
        }
        return Integer.parseInt(calibrationPair.toString());
    }

    private String getNumbers(String line, boolean digitsInLetters) {

        if (digitsInLetters) {
            var finder = new DigitsFinder();
            finder.findDigitsInLetters(line);
        }

        return Arrays.stream(line.split(""))
                .map(this::isNumber)
                .collect(Collectors.joining());
    }

    private String isNumber(String input) {
        try {
            Integer.parseInt(input);
            return input;
        } catch (NumberFormatException e) {
            return "";
        }
    }
}
