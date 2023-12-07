package org.example.year2023.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class GameValidator {

    private static final int MAX_COUNT_RED_CUBE = 12;
    private static final int MAX_COUNT_GREEN_CUBE = 13;
    private static final int MAX_COUNT_BLUE_CUBE = 14;

    Map<String, Integer> ballsCountChecker = Map.of("red", 12, "green", 13, "blue", 14);

    public boolean valid(List<String> gameSet) {
        List<List<BallType>> listStream =
                gameSet.stream()
                .map(this::getDistinctColor)
//                        .collect(Collectors.toList())
//        .filter(game -> validGame(game))
        .filter(game -> game.stream().allMatch(this::validRound)).toList();
//                        .mapToInt(validGames -> validGames.)

//                        .toList();

        System.out.println(listStream);
//                .allMatch(this::checkGame);
        return true;
    }

    private boolean validRound(BallType round) {
        if (ballsCountChecker.containsKey(round.color())) {
            return round.count < ballsCountChecker.get(round.color());
        }
        return false;
    }
        private boolean validGame (List < BallType > game) {
//            ballsCountChecker.entrySet().stream().filter()
                    return true;
        }

        private List<BallType> getDistinctColor (String set){
            return Arrays.stream(set.split(","))
                    .map(balls -> new BallType(balls.replaceAll(
                            "\\d", " ").trim(),
                            Integer.parseInt(balls.replaceAll("\\D", " ").trim())))
                    .toList();
        }


    private record BallType(String color, int count){}
}
