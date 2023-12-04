package org.example.year2023.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsFinder {

    private Pattern pattern = Pattern.compile("(one|two|three|four|five|six|seven|eight|nine)", Pattern.CASE_INSENSITIVE);

    private final Map<String, String> digits = Map.of(
            "one", "1",
            "two", "2",
            "three", "3",
            "four", "4",
            "five", "5",
            "six", "6",
            "seven", "7",
            "eight", "8",
            "nine", "9");

    public String findRightMostDigit(String line) {
        String procesedVal = line;
        var builder = new StringBuilder();
        String[] split = line.split("");
        for (int i = split.length - 1; i >= 0; i--) {
            builder.insert(0, split[i]);
//            System.out.println(builder.toString());
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
