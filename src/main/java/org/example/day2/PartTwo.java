package org.example.day2;

import java.util.List;

import static org.example.day2.Command.parse;
import static org.example.common.utils.DataReader.readFileAsList;

public class PartTwo {

    private PartTwo(){}

    public static int solvePartTwo(String path) {
        return solvePartTwo(readFileAsList(path));
    }

    public static int solvePartTwo(List<String> dataList) {
        if (dataList.isEmpty()) {
            return 0;
        }
        return new AdvancedSubmarine().run(parse(dataList));
    }
}