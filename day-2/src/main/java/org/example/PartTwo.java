package org.example;

import static org.example.DataReader.getDataFromFile;

import java.util.List;

public class PartTwo {

    private PartTwo() {
    }

    public static int solvePartTwo(String path) {

        int aim = 0;
        int forwardTotal = 0;
        int depth = 0;

        List<String> dataList = getDataFromFile(path);

        for (String data : dataList) {
            int number = Integer.parseInt(data.substring(data.length() - 1));
            if (data.startsWith("forward")) {
                forwardTotal += number;
                depth += aim * number;
            }
            if (data.startsWith("up")) {
                aim -= number;
            }
            if (data.startsWith("down")) {
                aim += number;
            }
        }
        return forwardTotal * depth;
    }
}