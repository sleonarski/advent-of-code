package org.example.year2023.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameStatsEngine {

    public GameStats createGameStats(String game) {
//        Pattern pattern = Pattern.compile
        String[] splitGameData = game.split(":");
        return new GameStats(splitGameData[0],
                Arrays.stream(splitGameData[1].split(";"))
                        .map(round -> convertToRoundStats(round)).toList());
    }

    private List<RoundStats> convertToRoundStats(String splitGameData) {

        List<RoundStats> balls = Arrays.stream(splitGameData.split(";"))
                .map(round -> convertToBallStats(round));
        return new RoundStats(balls);
    }
}
