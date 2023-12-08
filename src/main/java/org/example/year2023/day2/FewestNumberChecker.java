package org.example.year2023.day2;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FewestNumberChecker {

    public int calculate(List<GameStats> gameStatsList) {

        return gameStatsList.stream().mapToInt(gameStats -> calculateFewestNumberPower(gameStats)).sum();
    }

    private int calculateFewestNumberPower(GameStats gameStats) {
//        gameStats.getRoundStats().stream().map()
//        Map<String, Optional<BallStats>> collect = gameStats.getRoundStats().stream()
//                .flatMap(stats -> stats.getBallsBucket().stream()).collect(groupingBy(BallStats::getColour, minBy(Comparator.comparingInt(BallStats::getCount))));

//        gameStats.getRoundStats().stream().map(stats -> stats.getBallsBucket()).collect(groupingBy(ballStats -> ballStats.stream().map(
//                BallStats::getColour), minBy(Comparator.comparingInt(BallStats::getCount))));

//        List<Map<String, Integer>> list = gameStats.getRoundStats().stream().map(this::getMinCountOfBalls).toList();

       return calculateRoundStats(gameStats.getRoundStats());
    }

    private int calculateRoundStats(List<RoundStats> roundStats) {
//        roundStats.stream().map(stats -> checkstats.getBallsBucket())
        return roundStats.stream()
                .map(stat -> getMinBallsStats(stat))
                .filter(Objects::nonNull)
                .mapToInt(map -> multiply(map.values())).sum();

    }

    private int multiply(Collection<Integer> values) {
        return values.stream().reduce(1, (a, b) -> a * b);
    }

    private Map<String, Integer> getMinBallsStats(RoundStats stats) {
        Map<String, Integer> minBallsCountBucket = new HashMap<>();
        for (BallStats ball : stats.getBallsBucket()) {
            if (minBallsCountBucket.containsKey(ball.getColour())) {
                minBallsCountBucket.put(ball.getColour(), Integer.min(minBallsCountBucket.get(ball.getColour()), ball.getCount()));
            } else {
                minBallsCountBucket.put(ball.getColour(), ball.getCount());
            }
            return minBallsCountBucket;
        }

//        private Map<String, Integer> getMinCountOfBalls (List < RoundStats > roundStats) {
//        Map<String, Optional<BallStats>> collect = roundStats.getBallsBucket().stream()
//                .collect(groupingBy(BallStats::getColour, minBy(Comparator.comparingInt(BallStats::getCount))));

//         roundStats.getBallsBucket().stream()
//                .collect(toMap(BallStats::getColour, BallStats::getCount, Integer::min));

            return null;
        }

        private Map<String, Integer> getMinCountOfBalls (RoundStats roundStats){
//        Map<String, Optional<BallStats>> collect = roundStats.getBallsBucket().stream()
//                .collect(groupingBy(BallStats::getColour, minBy(Comparator.comparingInt(BallStats::getCount))));

            return roundStats.getBallsBucket().stream()
                    .collect(toMap(BallStats::getColour, BallStats::getCount, Integer::min));
        }
    }
