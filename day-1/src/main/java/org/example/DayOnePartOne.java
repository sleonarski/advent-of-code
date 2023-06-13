package org.example;

import static org.example.utils.DataParser.parseInput;

import java.util.List;

public class DayOnePartOne {

    public static int runPartOne(String path, int windowSize) {
        return runPartOne(parseInput(path), windowSize);
    }

    static int runPartOne(List<Integer> parsedInput, int windowSize) {
        return parsedInput.stream().collect(() -> new AggregatedWindow(windowSize), AggregatedWindow::nextNumber, (aw1, aw2) -> {
            throw new CollectingException();
        }).getCount();
    }
}