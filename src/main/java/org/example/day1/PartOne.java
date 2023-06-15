package org.example.day1;

import static org.example.common.utils.DataParser.parseInput;

import java.util.List;

public class PartOne {

    private PartOne() {
    }

    public static int runPartOne(String path, int windowSize) {
        return runPartOne(parseInput(path), windowSize);
    }

    static int runPartOne(List<Integer> parsedInput, int windowSize) {
        return parsedInput.stream().collect(() -> new AggregatedWindow(windowSize), (aggregatedWindow, number) -> aggregatedWindow.nextNumber(number), (aw1, aw2) -> {
            throw new CollectingException();
        }).getCount();
    }
}