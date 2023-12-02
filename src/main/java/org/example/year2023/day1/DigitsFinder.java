package org.example.year2023.day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsFinder {

    Pattern pattern = Pattern.compile("(one|two|three|four|five|six|seven|eight|nine)", Pattern.CASE_INSENSITIVE);

    public String findDigitsInLetters(String line) {
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            return line.replace(matcher.group(), "");
        } else {
            return line;
        }
    }
}
