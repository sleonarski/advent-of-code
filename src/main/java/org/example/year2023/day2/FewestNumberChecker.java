package org.example.year2023.day2;

import org.example.year2021.day1.CollectingException;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FewestNumberChecker {

    public int calculate(List<GameStats> gameStatsList) {

        return gameStatsList.stream()
                .map(this::calculateFewestNumberPower)
                .mapToInt(map -> calculatee(map))
                .sum();
    }

    private int calculatee(Map<String, Integer> map) {

        return map.values().stream().reduce(1, (a, b) -> a * b);
    }

    private Map<String, Integer> calculateFewestNumberPower(GameStats gameStats) {
        return getFewestNumber(gameStats.getRoundStats());
    }

    private Map<String, Integer> getFewestNumber2(List<RoundStats> roundStats) {
        Map<String, Integer> minBallsMap = new HashMap<>();

        for (RoundStats round : roundStats) {
            for (BallStats stats : round.getBallsBucket()) {

                String actualBallColour = stats.getColour();
                if (!minBallsMap.containsKey(actualBallColour)) {
                    minBallsMap.put(actualBallColour, stats.getCount());
                } else {
                    if (minBallsMap.get(actualBallColour) < stats.getCount())
                        minBallsMap.put(actualBallColour, stats.getCount());
                }
            }
        }
        return minBallsMap;
    }

    private Map<String, Integer> getFewestNumber(List<RoundStats> roundStats) {

        return roundStats.stream().collect(HashMap::new, this::createFewestNumberMap, (map1, map2) ->{
            throw new CollectingException();
        } );
    }

    private Map<String, Integer> createFewestNumberMap(Map<String, Integer> map, RoundStats stats) {

        for (BallStats ballStats : stats.getBallsBucket()) {

            String actualBallColour = ballStats.getColour();
            if (!map.containsKey(actualBallColour)) {
                map.put(actualBallColour, ballStats.getCount());
            } else {
                if (map.get(actualBallColour) < ballStats.getCount())
                    map.put(actualBallColour, ballStats.getCount());
            }
        }
        return map;
    }
}
