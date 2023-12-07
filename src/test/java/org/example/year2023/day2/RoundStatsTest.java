package org.example.year2023.day2;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Executable;
import org.junit.jupiter.api.Test;

class RoundStatsTest {

    @Test
    void shouldCreateRoundStatsObjectWhenListOfBallStatsIsNull() {
        //given
        var stats = new RoundStats(null);
        //expected
        assertEquals(0, stats.getDistinctBalls());
    }
}