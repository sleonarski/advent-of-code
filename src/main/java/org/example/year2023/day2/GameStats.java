package org.example.year2023.day2;

import java.util.List;

public class GameStats {

    private final String name;
    private final List<RoundStats> roundStats;
    private final int roundCount;

    public GameStats(String name, List<RoundStats> roundStats) {
        this.name = name;
        this.roundStats = roundStats;
        this.roundCount = roundStats != null && !roundStats.isEmpty() ? roundStats.size() : 0;
    }

    public String getName() {
        return name;
    }

    public List<RoundStats> getRoundStats() {
        return roundStats;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public int getGameNumber () {
        return Integer.parseInt(this.name.replaceAll("\\D","").trim());
    }
}
