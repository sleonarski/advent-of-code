package org.example.year2023.day1;

import java.util.function.Predicate;

public class DigitChecker implements Predicate<String> {

    @Override
    public boolean test(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
