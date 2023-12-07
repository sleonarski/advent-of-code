package org.example.year2023.day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class GamesPredicate {

    private static final int MAX_COUNT_RED_CUBE = 12;
    private static final int MAX_COUNT_GREEN_CUBE = 13;
    private static final int MAX_COUNT_BLUE_CUBE = 14;

    public boolean valid(List<String> gameSet) {
        List<List<Balls>> listStream = gameSet.stream()
                .map(this::getDistinctColor).collect(Collectors.toList());
//                .map();
        System.out.println(listStream);
//                .allMatch(this::checkGame);
        return true;
    }

    private List<Balls> getDistinctColor(String set) {
        return Arrays.stream(set.split(","))
                .map(balls -> new Balls(balls.replaceAll(
                        "\\d", " ").trim(),
                        Integer.parseInt(balls.replaceAll("\\D", " ").trim())))
                .toList();
    }

    private record Balls(String color, int count){}
}
