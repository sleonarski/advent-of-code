package org.example.year2023.day2;

import java.util.Collections;
import java.util.List;

public class RoundStats {

    private final List<BallStats> ballsBucket;
    private final int distinctBalls;

    public RoundStats(List<BallStats> ballsBucket) {
        this.ballsBucket = ballsBucket != null ? List.copyOf(ballsBucket) : List.of();
        this.distinctBalls = ballsBucket != null && !ballsBucket.isEmpty() ? ballsBucket.size() : 0;
    }

    public List<BallStats> getBallsBucket() {
        return ballsBucket;
    }

    public int getDistinctBalls() {
        return distinctBalls;
    }
}
