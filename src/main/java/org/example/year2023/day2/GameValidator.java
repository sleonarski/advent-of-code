package org.example.year2023.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class GameValidator {

    Map<String, Integer> ballsCountChecker = Map.of("red", 12, "green", 13, "blue", 14);

    public List<GameStats> valid(List<GameStats> gameStatsList) {

        return gameStatsList.stream()
                .filter(game -> game.getRoundStats().stream()
                        .allMatch(roundStats -> checkBucket(roundStats.getBallsBucket()))).toList();
    }

    private boolean checkBucket(List<BallStats> ballsBucket) {
        return ballsBucket.stream().allMatch(this::validBucket);
    }

    private boolean validBucket(BallStats round) {
        if (ballsCountChecker.containsKey(round.getColour())) {
            return round.getCount() <= ballsCountChecker.get(round.getColour());
        }
        return false;
    }
}
