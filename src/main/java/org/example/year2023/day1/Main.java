package org.example.year2023.day1;

import org.example.common.utils.DataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> parsedInput = DataReader.readFileAsList("src/main/resources/year2023/day1/input.txt");
        var calculator = new CalibrationCalculator();
        int output = calculator.calculateCalibrateValue(parsedInput, false);
        System.out.printf("Part One: %s%n", output);

        int output2 = calculator.calculateCalibrateValue(parsedInput, true);
        System.out.printf("Part Two: %s%n", output2);
    }
}
