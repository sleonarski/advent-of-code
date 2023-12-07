package org.example.year2023.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameStatsEngine {

    public List<GameStats> createGameStats(List<String> gameInput) {

        return gameInput.stream().map(game -> {
                    String[] splitGameData = game.split(":");
                    return new GameStats(splitGameData[0].trim(),
                            Arrays.stream(splitGameData[1].split(";"))
                                    .map(this::convertToRoundStats).toList());
                }
        ).toList();
    }

    private RoundStats convertToRoundStats(String roundData) {

        return new RoundStats(Arrays.stream(roundData.split(","))
                .map(this::convertToBallStats).toList());
    }

    private BallStats convertToBallStats(String round) {
        String[] splitRoundData = round.trim().split(" ");
        return new BallStats(splitRoundData[1].trim(), Integer.parseInt(splitRoundData[0].trim()));
    }
}
