package org.example.year2023.day1;

public class NumberChecker {

    public boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
