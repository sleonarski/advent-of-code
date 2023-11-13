package org.example.year2021.day2;

import java.util.List;

import static org.example.common.utils.DataReader.readFileAsList;
import static org.example.year2021.day2.Command.parse;

public class PartOne {

    private PartOne() {}

    public static int solvePartOne(String path) {
        return solvePartOne(readFileAsList(path));
    }

    static int solvePartOne(List<String> dataList) {
        if (dataList.isEmpty()) {
            return 0;
        }
        return new SimpleSubmarine(parse(dataList)).getSumValue();
    }
}