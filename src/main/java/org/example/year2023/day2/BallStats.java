package org.example.year2023.day2;

public class BallStats {

    private final String colour;
    private final int count;

    public BallStats(String colour, int count) {
        this.colour = colour;
        this.count = count;
    }

    public String getColour() {
        return colour;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "BallStats{" +
                "colour='" + colour + '\'' +
                ", count=" + count +
                '}';
    }
}
