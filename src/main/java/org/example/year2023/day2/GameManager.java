package org.example.year2023.day2;

import java.util.List;

public class GameManager {

    public int calculateSum(List<String> input) {

        var engine = new GameStatsEngine();
        var validator = new GameValidator();

        List<GameStats> gameStatsList = engine.createGameStats(input);

        List<GameStats> validGamesList = validator.valid(gameStatsList);

        return calculate(validGamesList);
    }

    private int calculate(List<GameStats> validGamesList) {

        return validGamesList.stream().mapToInt(GameStats::getGameNumber).sum();
    }
}
