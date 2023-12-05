package org.example.year2023.day1;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsFinder {

    private final Pattern pattern = Pattern.compile("(one|two|three|four|five|six|seven|eight|nine)", Pattern.CASE_INSENSITIVE);
    private final NumberChecker checker = new NumberChecker();

    private final Map<String, String> digits = Map.of(
            "one", "o1e",
            "two", "t2o",
            "three", "t3e",
            "four", "f4r",
            "five", "f5e",
            "six", "s6x",
            "seven", "s7n",
            "eight", "e8t",
            "nine", "n9e");

    public String findRightMostDigit(String line) {
        String procesedVal = line;
        var builder = new StringBuilder();
        String[] split = line.split("");
        for (int i = split.length - 1; i >= 0; i--) {
            if (checker.isNumber(split[i])) {
                return procesedVal;
            }
            builder.insert(0, split[i]);
            Matcher matcher = pattern.matcher(builder);
            if (matcher.find()) {
                String numberFound = matcher.group();
                procesedVal = procesedVal.replace(numberFound, digits.get(numberFound));
                return procesedVal;
            }
        }
        return procesedVal;
    }

    public String findLeftMostDigit(String line) {
        String procesedVal = line;
        var builder = new StringBuilder();
        String[] split = line.split("");
        for (int i = 0; i <= split.length - 1; i++) {
            if (checker.isNumber(split[i])) {
                return procesedVal;
            }
            builder.insert(i, split[i]);
            Matcher matcher = pattern.matcher(builder);
            if (matcher.find()) {
                String numberFound = matcher.group();
                procesedVal = procesedVal.replace(numberFound, digits.get(numberFound));
                return procesedVal;
            }
        }
        return procesedVal;
    }
}
