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
        System.out.print("First: " + firstNumber);
        if (numbers.length() == 1) {
            calibrationPair.append(firstNumber);
            System.out.println(" Second: " + firstNumber);
        } else {
            char lastNumber = numbers.charAt(numbers.length() - 1);
            System.out.println(" Second: " + lastNumber);
            calibrationPair.append(lastNumber);
        }
        return Integer.parseInt(calibrationPair.toString());
    }

    private String getNumbers(String line, boolean digitsInLetters) {

        String processedLine = line;
        if (digitsInLetters) {
//            System.out.println("_______________________________");
//            System.out.println("before " + processedLine);
            var finder = new DigitsFinder();
//            String leftDigitLine = finder.findLeftMostDigit(processedLine);
//            System.out.println("before processed " + processedLine);
            processedLine = finder.findRightMostDigit(processedLine);
            processedLine = finder.findLeftMostDigit(processedLine);
//            System.out.println("left processed " + processedLine);
//            String rightDigitLine = finder.findRightMostDigit(leftDigitLine);
//            System.out.println("right processed " + processedLine);
//            System.out.println("after " + processedLine);
        }

        return Arrays.stream(processedLine.split(""))
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
