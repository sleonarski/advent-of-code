package org.example.year2023.day3;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class EngineSchemaCompiler {
    public int calculate(String testInput) {

        List<String> slicedInput = Arrays.stream(testInput.split("\n")).toList();

        List<List<Integer>> list = slicedInput.stream()
                .map(row -> getParts(row)).toList();

        return 0;
    }

    private List<Integer> getParts(String row) {
        List<String> rowsList = Arrays.stream(row.split("")).toList();

        List<Integer> list = IntStream.range(0, rowsList.size())
                .filter(i -> isPart(rowsList.get(i)))
                .boxed()
                .toList();

        return list;
    }

    private static boolean isPart(String symbol) {
        return !symbol.equals(".");
    }

    private boolean isNumber(Object i) {
        return true;
    }

}
