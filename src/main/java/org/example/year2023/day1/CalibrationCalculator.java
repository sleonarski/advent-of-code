package org.example.year2023.day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalibrationCalculator {

    public int calculateCalibrateValue(List<String> input, boolean digitsInLetters) {

        return input.stream()
                .map(line -> getNumbers(line, digitsInLetters))
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
        var checker = new NumberChecker();
        String processedLine = line;
        if (digitsInLetters) {
            var finder = new DigitsFinder();
            processedLine = finder.findLeftMostDigit(processedLine);
            processedLine = finder.findRightMostDigit(processedLine);
        }

        return Arrays.stream(processedLine.split(""))
                .map(mark -> checker.isNumber(mark) ? mark : "")
                .collect(Collectors.joining());
    }
}
