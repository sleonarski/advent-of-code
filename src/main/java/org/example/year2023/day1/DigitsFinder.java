package org.example.year2023.day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsFinder {

    Pattern pattern = Pattern.compile("(one|two|three|four|five|six|seven|eight|nine)", Pattern.CASE_INSENSITIVE);

    public String findDigitsInLetters(String line) {
//        Matcher matcher = pattern.matcher(line);
        String replaced = line;
        StringBuilder builder = new StringBuilder();
        String[] split = line.split("");
        for (int i = split.length - 1; i >= 0; i--) {
            builder.insert(0, split[i]);
//            System.out.print(split[i]);
            System.out.println(builder.toString());
            Matcher matcher1 = pattern.matcher(builder);
            if (matcher1.find()) {
//                builder.
                replaced = replaced.replace(matcher1.group(), "");
                return replaced;
            }
        }
        return replaced;
    }
}
