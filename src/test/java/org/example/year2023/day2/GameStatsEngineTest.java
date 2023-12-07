package org.example.year2023.day2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameStatsEngineTest {

    private static final String TEST_INPUT = "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green";

    @Test
    void shouldCalculate() {
        //given
        GameStatsEngine engine = new GameStatsEngine();
        List<String> testInputList = List.of(TEST_INPUT);
        //when
        List<GameStats> gameStats = engine.createGameStats(testInputList);
        //then
        assertEquals(3, gameStats.get(0).getRoundCount());
    }
}