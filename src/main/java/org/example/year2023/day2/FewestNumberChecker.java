package org.example.year2023.day2;

import java.util.List;
import java.util.function.Function;

public class FewestNumberChecker {

    public int calculate(List<GameStats> gameStatsList) {

        gameStatsList.stream().mapToInt(gameStats -> checkFewestNumber(gameStats))
        return 0;
    }

    private int checkFewestNumber(GameStats gameStats) {
//        gameStats.getRoundStats().stream().mapToInt(roundStats -> getMinCountBalls(roundStats.getBallsBucket()))
        gameStats.getRoundStats().stream()
                .flatMap(stats -> stats.getBallsBucket().stream())
                .mapToInt()
    }

    private int getMinCountBalls(List<BallStats> ballsBucket) {

    }
}
